package COP3703.MovieDatabase.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_copies")
public class movie_copies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CopyID;

	@Column(name = "MovieID")
	private int MovieID;

	@Column(name = "NewRelease")
	private String NewRelease;

	@Column(name = "Price")
	private float Price;

	@Column(name = "UsedCondition")
	private String UsedCondition;

	@Column(name = "CurrentlyRented")
	private String CurrentlyRented;

	@Column(name = "DueDate")
	private Date DueDate;

	public int getCopyID() {
		return CopyID;
	}

	public void setCopyID(int copyID) {
		CopyID = copyID;
	}

	public int getMovieID() {
		return MovieID;
	}

	public void setMovieID(int movieID) {
		MovieID = movieID;
	}

	public String getNewRelease() {
		return NewRelease;
	}

	public void setNewRelease(String newRelease) {
		NewRelease = newRelease;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getUsedCondition() {
		return UsedCondition;
	}

	public void setUsedCondition(String usedCondition) {
		UsedCondition = usedCondition;
	}

	public String getCurrentlyRented() {
		return CurrentlyRented;
	}

	public void setCurrentlyRented(String currentlyRented) {
		CurrentlyRented = currentlyRented;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}

}
