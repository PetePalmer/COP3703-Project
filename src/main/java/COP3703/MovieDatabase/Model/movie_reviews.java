package COP3703.MovieDatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_reviews")
public class movie_reviews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ReviewID;

	@Column(name = "MovieName")
	private String movieName;

	@Column(name = "Username")
	private String userName;

	@Column(name = "Rating")
	private Integer Rating;

	@Column(name = "Review")
	private String Review;
	
	public movie_reviews() {
		
	}
//	public movie_reviews(String movieName, String userName, Integer rating, String review) {
//		this.ReviewID = 1;
//		this.MovieName = movieName;
//		this.Username = userName;
//		this.Rating = rating;
//		this.Review = review;
//	}
	
//	public movie_reviews(movie_reviews newReview) {
//		this.MovieName = newReview.getMovieName();
//		this.Username = newReview.getUsername();
//		this.Rating = newReview.getRating();
//		this.Review = newReview.getReview();
//	}

	public Integer getReviewID() {
		return ReviewID;
	}

	public void setReviewID(Integer reviewID) {
		ReviewID = reviewID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String MovieName) {
		movieName = MovieName;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public String getReview() {
		return Review;
	}

	public void setReview(String review) {
		Review = review;
	}

}
