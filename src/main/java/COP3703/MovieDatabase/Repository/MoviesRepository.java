package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.movies;

public interface MoviesRepository extends JpaRepository<movies, Long> {
	
	movies findByMovieName(String MovieName);

}
