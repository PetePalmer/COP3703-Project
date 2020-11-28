package COP3703.MovieDatabase.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import COP3703.MovieDatabase.Model.customer_balances;
import COP3703.MovieDatabase.Repository.CustomerBalanceRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/balance")
public class BalanceController {
	
	@Autowired
	CustomerBalanceRepository balanceRepo;
	
	@GetMapping("/{userName}")
	public ResponseEntity<customer_balances> findByUsername(@PathVariable("userName") String userName){
		try {
			customer_balances balance = balanceRepo.findByUserName(userName);
			if (balance == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(balance, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
