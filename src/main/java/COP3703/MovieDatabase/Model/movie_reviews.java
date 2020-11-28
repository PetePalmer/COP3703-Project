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
	private String MovieName;

	@Column(name = "Username")
	private String Username;

	@Column(name = "Rating")
	private Integer Rating;

	@Column(name = "Review")
	private String Review;
	
	public movie_reviews() {
		
	}
	
	public movie_reviews(movie_reviews newReview) {
		this.MovieName = newReview.getMovieName();
		this.Username = newReview.getUsername();
		this.Rating = newReview.getRating();
		this.Review = newReview.getReview();
	}

	public Integer getReviewID() {
		return ReviewID;
	}

	public void setReviewID(Integer reviewID) {
		ReviewID = reviewID;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String MovieName) {
		MovieName = MovieName;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
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
