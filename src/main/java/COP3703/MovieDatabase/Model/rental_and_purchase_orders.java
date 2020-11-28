package COP3703.MovieDatabase.Model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rental_and_purchase_orders")
public class rental_and_purchase_orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer TranscationID;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "MovieName")
	private String movieName;

	@Column(name = "RentedOrPurchased")
	private String RentedOrPurchased;

	@Column(name = "OrderDate")
	private Date OrderDate;

	@Column(name = "TransactionTotal")
	private Float TransactionTotal;

	@Column(name = "CheckOutDate")
	private Date CheckOutDate;

	@Column(name = "ExpectedReturnDate")
	private Date ExpectedReturnDate;

	@Column(name = "ReturnDate")
	private Date ReturnDate;
	
	@Column(name = "BalancePaid")
	private String BalancePaid;
	
	public rental_and_purchase_orders() {
		
	}

	public rental_and_purchase_orders(rental_and_purchase_orders transaction, boolean newRelease) {
		this.userName = transaction.getUserName();
		this.RentedOrPurchased = transaction.getRentedOrPurchased();
		this.movieName = transaction.getMovieName();
		this.OrderDate = transaction.getOrderDate();
		this.TransactionTotal = transaction.getTransactionTotal();
		this.CheckOutDate = transaction.getCheckOutDate();
		this.ReturnDate = transaction.getReturnDate();
		this.ExpectedReturnDate = this.calculateReturnDate(newRelease);
	}

	private Date calculateReturnDate(boolean newRelease) {
		int numOfDays = 0;
		if (newRelease) {
			numOfDays = 4;
		} else {
			numOfDays = 5;
		}
		java.util.Date date = new java.util.Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, numOfDays);
		return new java.sql.Date(c.getTimeInMillis());
	}

	public Integer getTranscationID() {
		return TranscationID;
	}

	public void setTranscationID(Integer transcationID) {
		TranscationID = transcationID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		userName = userName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getRentedOrPurchased() {
		return RentedOrPurchased;
	}

	public void setRentedOrPurchased(String rentedOrPurchased) {
		RentedOrPurchased = rentedOrPurchased;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public Float getTransactionTotal() {
		return TransactionTotal;
	}

	public void setTransactionTotal(Float transactionTotal) {
		TransactionTotal = transactionTotal;
	}

	public Date getCheckOutDate() {
		return CheckOutDate;
	}

	public void setCheckOutDate(Date CheckOutDate) {
		CheckOutDate = CheckOutDate;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date ReturnDate) {
		ReturnDate = ReturnDate;
	}

	public Date getExpectedReturnDate() {
		return ExpectedReturnDate;
	}

	public void setExpectedReturnDate(Date expectedReturnDate) {
		ExpectedReturnDate = expectedReturnDate;
	}
	
	public String getBalancePaid() {
		return BalancePaid;
	}

	public void setBalancePaid(String balancePaid) {
		BalancePaid = balancePaid;
	}

}
