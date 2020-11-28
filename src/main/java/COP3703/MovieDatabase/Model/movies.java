package COP3703.MovieDatabase.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="movies")
public class movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long MovieID;

	@Column(name = "MovieName")
	private String movieName;

	@Column(name = "NumberOfCopies")
	private Integer NumberOfCopies;

	@Column(name = "CopiesCurrentlyRented")
	private Integer CopiesCurrentlyRented;

	@Column(name = "Genre")
	private String Genre;

	@Column(name = "AverageUserRating")
	private Float AverageUserRating;

	@Column(name = "NumberOfUserReviews")
	private Integer NumberOfUserReviews;

	@Column(name = "MPAARating")
	private String MPAARating;

	@Column(name = "ReleaseDate")
	private Date ReleaseDate;

	@Column(name = "MainActor")
	private String MainActor;

	@Column(name = "SupportingActor")
	private String SupportingActor;

	@Column(name = "Director")
	private String Director;

	@Column(name = "Runtime")
	private Integer Runtime;

	@Column(name = "NewRelease")
	private String NewRelease;
	
	@Column (name = "MovieCost")
	private Float movieCost;

	public movies() {

	}

	public Long getMovieID() {
		return MovieID;
	}

	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getNumberOfCopies() {
		return NumberOfCopies;
	}

	public void setNumberOfCopies(Integer numberOfCopies) {
		NumberOfCopies = numberOfCopies;
	}

	public Integer getCopiesCurrentlyRented() {
		return CopiesCurrentlyRented;
	}

	public void setCopiesCurrentlyRented(Integer copiesCurrentlyRented) {
		CopiesCurrentlyRented = copiesCurrentlyRented;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public Float getAverageUserRating() {
		return AverageUserRating;
	}

	public void setAverageUserRating(Float averageUserRating) {
		AverageUserRating = averageUserRating;
	}

	public Integer getNumberOfUserReviews() {
		return NumberOfUserReviews;
	}

	public void setNumberOfUserReviews(Integer numberOfUserReviews) {
		NumberOfUserReviews = numberOfUserReviews;
	}

	public String getMPAARating() {
		return MPAARating;
	}

	public void setMPAARating(String mPAARating) {
		MPAARating = mPAARating;
	}

	public Date getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}

	public String getMainActor() {
		return MainActor;
	}

	public void setMainActor(String mainActor) {
		MainActor = mainActor;
	}

	public String getSupportingActor() {
		return SupportingActor;
	}

	public void setSupportingActor(String supportingActor) {
		SupportingActor = supportingActor;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public Integer getRuntime() {
		return Runtime;
	}

	public void setRuntime(Integer runtime) {
		Runtime = runtime;
	}

	public String getNewRelease() {
		return NewRelease;
	}

	public void setNewRelease(String newRelease) {
		NewRelease = newRelease;
	}

	public Float getMovieCost() {
		return movieCost;
	}

	public void setMovieCost(Float movieCost) {
		this.movieCost = movieCost;
	}

//	public movies(String name, int numberOfCopies, int rentedCopies, String genre, float avgRating, int reviewCount,
//			String MPAARating, Date releaseDate, String mainActor, String supportingActor, String director, int runTime,
//			String newRelease) {
//		this.movieName = name;
//		this.NumberOfCopies = numberOfCopies;
//		this.CopiesCurrentlyRented = rentedCopies;
//		this.Genre = genre;
//		this.AverageUserRating = avgRating;
//		this.NumberOfUserReviews = reviewCount;
//		this.MPAARating = MPAARating;
//		this.ReleaseDate = releaseDate;
//		this.MainActor = mainActor;
//		this.SupportingActor = supportingActor;
//		this.Director = director;
//		this.Runtime = runTime;
//		this.NewRelease = newRelease;
//	}
	

}
