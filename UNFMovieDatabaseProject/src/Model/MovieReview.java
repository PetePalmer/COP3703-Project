package Model;

public class MovieReview {
	
	public int id;
	
	public int movieId;
	
	public String userName;
	
	public int review; //What is this for?
	
	public String writtenReview;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	public String getWrittenReview() {
		return writtenReview;
	}

	public void setWrittenReview(String writtenReview) {
		this.writtenReview = writtenReview;
	}
}
