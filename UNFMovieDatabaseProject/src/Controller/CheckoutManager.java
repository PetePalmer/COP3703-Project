package Controller;

import Model.Movie;
import Model.Transaction;

public class CheckoutManager {
	
	//number 6
	public boolean isNewRelease(String releaseDate) {
		return true;
		//do logic where you compare the releaseDate to todays date. 
		//if its less than 2 months, its a new release
	}
	
	//number 14
	public boolean customerBalanceCheck() {
		//if customer balance is 0, return true;
		return true;
	}
	
	public boolean rentalMovieCheck() {
		//if customer currently have more than 2 movies rented, return false;
		return true;
	}
	
	//number 11
	public int determineRentPeriod(Movie rentedMovie) {
		if(this.isNewRelease(rentedMovie.getReleaseDate())) {
			return 4;
		}else {
			return 5;
		}
	}

	//number 12
	public double determineRentRate(Movie rentedMovie) {
		if(this.isNewRelease(rentedMovie.getReleaseDate())) {
			return 4.50;
		}else {
			return 3.00;
		}
	}
	
	//number 12 and 13
	public double determineLateFees(Transaction transaction) {
		// int lateDays = todayDate - transaction.getRentalDueDate()
//		if(lateDays > 15) {
//			return full movie price - might call a different method to get moviePrice
//		}else {
//			return lateDays * $2
//		}
		return 0;
	}
	
	
	
	
	
	

}
