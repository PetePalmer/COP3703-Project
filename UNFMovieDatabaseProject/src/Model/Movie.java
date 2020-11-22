package Model;

public class Movie {
	
	public int id;
	
	public int numberOfCopies;
	
	public int numberOfRentedCopies;
	
	public Genre genre;
	
	public float avgUserReview;
	
	public String MPAARating;
	
	public String releaseDate;
	
	public Actor actor;
	
	public Actor mainActor;
	
	public Actor supportingActor;
	
	public int runTime;
	
	public String description;
	
	//public String newRelease; 
	//not really needed

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public int getNumberOfRentedCopies() {
		return numberOfRentedCopies;
	}

	public void setNumberOfRentedCopies(int numberOfRentedCopies) {
		this.numberOfRentedCopies = numberOfRentedCopies;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public float getAvgUserReview() {
		return avgUserReview;
	}

	public void setAvgUserReview(float avgUserReview) {
		this.avgUserReview = avgUserReview;
	}

	public String getMPAARating() {
		return MPAARating;
	}

	public void setMPAARating(String mPAARating) {
		MPAARating = mPAARating;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Actor getMainActor() {
		return mainActor;
	}

	public void setMainActor(Actor mainActor) {
		this.mainActor = mainActor;
	}

	public Actor getSupportingActor() {
		return supportingActor;
	}

	public void setSupportingActor(Actor supportingActor) {
		this.supportingActor = supportingActor;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
