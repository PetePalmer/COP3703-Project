package COP3703.MovieDatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployeeID;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "EmailAddress")
	private String EmailAddress;

	@Column(name = "PhoneNumber")
	private String PhoneNumber;

	@Column(name = "Salary")
	private float Salary;

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
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

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

}
