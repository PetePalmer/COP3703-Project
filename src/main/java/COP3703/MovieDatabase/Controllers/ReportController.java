package COP3703.MovieDatabase.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import COP3703.MovieDatabase.Model.rental_and_purchase_orders;
import COP3703.MovieDatabase.Repository.MoviesRepository;
import COP3703.MovieDatabase.Repository.RentalAndPurchaseRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/report")
public class ReportController {

	@Autowired
	RentalAndPurchaseRepository transactionRepo;

	@Autowired
	MoviesRepository movieRepo;

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
	
	@GetMapping("/genre/{genreName}")
	public ResponseEntity<List<rental_and_purchase_orders>> getTransactionsByGenre(@PathVariable("genreName") String genreName) {
		try {
			List<rental_and_purchase_orders> transactions = new ArrayList<>();
			transactionRepo.findByGenre(genreName).forEach(transactions::add);
			if (transactions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transactions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/movie/{movieName}")
	public ResponseEntity<List<rental_and_purchase_orders>> getTransactionsByMovieName(@PathVariable("movieName") String movieName) {
		try {
			List<rental_and_purchase_orders> transactions = new ArrayList<>();
			transactionRepo.findByMovieName(movieName).forEach(transactions::add);
			if (transactions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transactions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
