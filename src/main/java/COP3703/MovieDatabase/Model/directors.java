package COP3703.MovieDatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class directors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DirectorNumber;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	public int getDirectorNumber() {
		return DirectorNumber;
	}

	public void setDirectorNumber(int directorNumber) {
		DirectorNumber = directorNumber;
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

}
