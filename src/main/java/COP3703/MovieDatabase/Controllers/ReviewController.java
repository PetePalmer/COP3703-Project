package COP3703.MovieDatabase.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import COP3703.MovieDatabase.Model.movie_reviews;
import COP3703.MovieDatabase.Repository.MovieReviewRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	MovieReviewRepository reviewRepo;

	@PostMapping("/")
	public ResponseEntity<Object> createNewReview(@RequestBody movie_reviews movieReview) {
		try {
			movie_reviews newReview = reviewRepo.save(movieReview);
			return new ResponseEntity<>(newReview, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
