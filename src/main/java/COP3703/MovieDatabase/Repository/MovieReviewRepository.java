package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.movie_reviews;

public interface MovieReviewRepository extends JpaRepository<movie_reviews, Integer> {

}
