package COP3703.MovieDatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class genres {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int GenreId;
	
	@Column(name = "GenreName")
	private String GenreName;

	public int getGenreId() {
		return GenreId;
	}

	public void setGenreId(int genreId) {
		GenreId = genreId;
	}
	
	public String getGenreName() {
		return GenreName;
	}

	public void setGenreName(String genreName) {
		GenreName = genreName;
	}

}
