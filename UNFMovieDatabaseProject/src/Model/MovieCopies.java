package Model;

public class MovieCopies {
	
	public int id;
	
	public int movieId;
	
	public String newRelease; //can be a boolean method checck instead of variable
	
	public float price;
	
	public String currentlyRented;
	
	public String dueDate;
	
	public String usedCondition;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getNewRelease() {
		return newRelease;
	}

	public void setNewRelease(String newRelease) {
		this.newRelease = newRelease;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCurrentlyRented() {
		return currentlyRented;
	}

	public void setCurrentlyRented(String currentlyRented) {
		this.currentlyRented = currentlyRented;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getUsedCondition() {
		return usedCondition;
	}

	public void setUsedCondition(String usedCondition) {
		this.usedCondition = usedCondition;
	}

}
