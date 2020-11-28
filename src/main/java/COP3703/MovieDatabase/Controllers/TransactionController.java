package COP3703.MovieDatabase.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import COP3703.MovieDatabase.Model.customer_balances;
import COP3703.MovieDatabase.Model.movies;
import COP3703.MovieDatabase.Model.rental_and_purchase_orders;
import COP3703.MovieDatabase.Repository.CustomerBalanceRepository;
import COP3703.MovieDatabase.Repository.MoviesRepository;
import COP3703.MovieDatabase.Repository.RentalAndPurchaseRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	RentalAndPurchaseRepository transactionRepo;

	@Autowired
	MoviesRepository movieRepo;

	@Autowired
	CustomerBalanceRepository balanceRepo;

	@GetMapping("/")
	public ResponseEntity<List<rental_and_purchase_orders>> getAllTransactions() {
		try {
			List<rental_and_purchase_orders> transactions = new ArrayList<>();
			transactionRepo.findAll().forEach(transactions::add);
			if (transactions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transactions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<List<rental_and_purchase_orders>> searchUser(@PathVariable("username") String username) {
		try {
			List<rental_and_purchase_orders> transactions = transactionRepo.findByUserName(username);
			if (transactions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transactions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/new")
	public ResponseEntity<Object> createNewTransaction(@RequestBody rental_and_purchase_orders transaction) {
		try {
			if (!this.checkBalance(transaction.getUserName())) {
				return new ResponseEntity<>("Custom has existing balance", HttpStatus.CONFLICT);
			} else if (!this.checkRentals(transaction.getUserName())) {
				return new ResponseEntity<>("Customer has met max rental count", HttpStatus.CONFLICT);
			} else {
				rental_and_purchase_orders newTransaction = transactionRepo
						.save(transaction);
				
				return new ResponseEntity<>(newTransaction, HttpStatus.CREATED);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<rental_and_purchase_orders> updateTransaction(@PathVariable("id") Integer id) {
		try {
			Optional<rental_and_purchase_orders> transactionData = transactionRepo.findById(id);

			if (transactionData.isPresent()) {
				rental_and_purchase_orders updateTransaction = transactionData.get();
				java.util.Date date = new java.util.Date();
				java.sql.Date sqlDate = new java.sql.Date(date.getTime());
				updateTransaction.setReturnDate(sqlDate);
				float withLateFees = updateTransaction.getTransactionTotal()
						+ this.calculateLateFees(updateTransaction.getMovieName());
				updateTransaction.setTransactionTotal(withLateFees);

				movies updateMovie = movieRepo.findByMovieName(updateTransaction.getMovieName());
				updateMovie.setCopiesCurrentlyRented(updateMovie.getCopiesCurrentlyRented() - 1);
				updateMovie.setNumberOfCopies(updateMovie.getNumberOfCopies() + 1);
				movieRepo.save(updateMovie);
				
				customer_balances existingBalance = balanceRepo.findByUserName(updateTransaction.getUserName());
				existingBalance.setOutstandingFees(updateTransaction.getTransactionTotal());
				balanceRepo.save(existingBalance);

				return new ResponseEntity<>(transactionRepo.save(updateTransaction), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/paid/{userName}")
	public ResponseEntity<Object> payTransactionBalance(@PathVariable("userName") String userName) {
		try {
			customer_balances existingBalance = balanceRepo.findByUserName(userName);

			if (existingBalance != null) {
				existingBalance.setOutstandingFees(0);
				balanceRepo.save(existingBalance);

				return new ResponseEntity<>(balanceRepo.save(existingBalance), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public java.util.Date convertDate(java.sql.Date sqlDate) {
		return new java.util.Date(sqlDate.getTime());
	}

	public java.util.Date todaysDate() {
		return new java.util.Date();
	}

	public java.util.Date getReleaseDate(String movieName) {
		movies rentalMovie = movieRepo.findByMovieName(movieName);
		return convertDate(rentalMovie.getReleaseDate());
	}

	public float getMovieCost(String movieName) {
		movies rentalMovie = movieRepo.findByMovieName(movieName);
		return rentalMovie.getMovieCost();
	}

	// movie is consider new release if release less than two months ago
	public boolean newRelease(String movieName) {
		long diff = Math.abs(this.todaysDate().getMonth() - this.getReleaseDate(movieName).getMonth());
		if (diff > 2) {
			return false;
		} else {
			return true;
		}
	}

	// if late for more than 15 days, customer is charge full movie price. Other
	// than that, its $2/day
	public float calculateLateFees(String movieName) {
		long diff = Math.abs(this.todaysDate().getTime() - this.getReleaseDate(movieName).getTime());
		if (diff > 15) {
			return this.getMovieCost(movieName);
		} else {
			return diff * 2;
		}
	}

	// Customers have a max rental count of 2
	public boolean checkRentals(String userName) {
		Long count = transactionRepo.getRentalCountForUser(userName);
		if (count > 2) {
			return false;
		} else {
			return true;
		}
	}

	// Customers can only rent if balance is 0
	public boolean checkBalance(String userName) {
		customer_balances customer = balanceRepo.findByUserName(userName);
		float balance = customer.getOutstandingFees();
		if (balance > 0) {
			return false;
		} else {
			return true;
		}
	}

}
