package COP3703.MovieDatabase.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.genres;

public interface GenresRespository extends JpaRepository<genres, String>{

}
