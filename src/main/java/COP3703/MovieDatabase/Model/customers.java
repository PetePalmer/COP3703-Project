package COP3703.MovieDatabase.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CustomerId;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "EmailAddress")
	private String EmailAddress;

	@Column(name = "Password")
	private String Password;

	@Column(name = "PhoneNumber")
	private String PhoneNumber;

	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "ReviewID")
	private int ReviewID;

	@Column(name = "EmployeeID")
	private int EmployeeID;

	@Column(name = "MostLikedGenre")
	private String MostLikedGenre;

	@Column(name = "SecondMostLikedGenre")
	private String SecondMostLikedGenre;

	@Column(name = "MostViewedActor")
	private String MostViewedActor;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		userName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public int getReviewID() {
		return ReviewID;
	}

	public void setReviewID(int reviewID) {
		ReviewID = reviewID;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getMostLikedGenre() {
		return MostLikedGenre;
	}

	public void setMostLikedGenre(String mostLikedGenre) {
		MostLikedGenre = mostLikedGenre;
	}

	public String getSecondMostLikedGenre() {
		return SecondMostLikedGenre;
	}

	public void setSecondMostLikedGenre(String secondMostLikedGenre) {
		SecondMostLikedGenre = secondMostLikedGenre;
	}

	public String getMostViewedActor() {
		return MostViewedActor;
	}

	public void setMostViewedActor(String mostViewedActor) {
		MostViewedActor = mostViewedActor;
	}

}
