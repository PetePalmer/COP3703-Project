package Model;

import Model.Shared.PersonalInformation;

public class Customer extends PersonalInformation{
	
	public String userName;
	
	public String password;
	
	public String dateOfBirth;
	
	public String phoneNumber;
	
	public String email;
	
	public String mostLikedGenre;
	
	public String secondLikedGenre;
	
	public String mostViewedActor;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMostLikedGenre() {
		return mostLikedGenre;
	}

	public void setMostLikedGenre(String mostLikedGenre) {
		this.mostLikedGenre = mostLikedGenre;
	}

	public String getSecondLikedGenre() {
		return secondLikedGenre;
	}

	public void setSecondLikedGenre(String secondLikedGenre) {
		this.secondLikedGenre = secondLikedGenre;
	}

	public String getMostViewedActor() {
		return mostViewedActor;
	}

	public void setMostViewedActor(String mostViewedActor) {
		this.mostViewedActor = mostViewedActor;
	}
	
}
