package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.movie_copies;

public interface MovieCopiesRepository extends JpaRepository<movie_copies, Integer> {

}
