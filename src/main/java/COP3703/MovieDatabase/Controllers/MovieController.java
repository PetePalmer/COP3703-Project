package COP3703.MovieDatabase.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import COP3703.MovieDatabase.Model.movies;
import COP3703.MovieDatabase.Repository.MoviesRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	MoviesRepository movieRepo;

	@GetMapping("/")
	public ResponseEntity<List<movies>> getAllMovies(@RequestParam(required = false) String movieName) {
		try {
			List<movies> movies = new ArrayList<>();

			if (movieName == null) {
				movies = movieRepo.findAll();
				//movieRepo.findAll().forEach(movies::add);
			} else {
				movies.add(movieRepo.findByMovieName(movieName));
			}

			if (movies.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(movies, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{movieName}")
	public ResponseEntity<movies> searchMovie(@PathVariable("movieName") String movieName) {
		try {
			movies result = new movies();
			
			result = movieRepo.findByMovieName(movieName);

			if (result != null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
