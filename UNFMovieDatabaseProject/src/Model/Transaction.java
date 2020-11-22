package Model;

public class Transaction {
	
	public int id;
	
	public String userName;
	
	public int rentedMovieCount;
	
	public int purchasedMovieCount;
	
	public float transactionTotal;
	
	public String rentalDueDate;
	
	public String returnedDate; //the actual returned date, can be null
	
	public String orderDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRentedMovieCount() {
		return rentedMovieCount;
	}

	public void setRentedMovieCount(int rentedMovieCount) {
		this.rentedMovieCount = rentedMovieCount;
	}

	public int getPurchasedMovieCount() {
		return purchasedMovieCount;
	}

	public void setPurchasedMovieCount(int purchasedMovieCount) {
		this.purchasedMovieCount = purchasedMovieCount;
	}

	public float getTransactionTotal() {
		return transactionTotal;
	}

	public void setTransactionTotal(float transactionTotal) {
		this.transactionTotal = transactionTotal;
	}

	public String getRentalDueDate() {
		return rentalDueDate;
	}

	public void setRentalDueDate(String rentalDueDate) {
		this.rentalDueDate = rentalDueDate;
	}

	public String getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
