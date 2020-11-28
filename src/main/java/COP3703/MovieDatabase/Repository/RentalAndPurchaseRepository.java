package COP3703.MovieDatabase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import COP3703.MovieDatabase.Model.rental_and_purchase_orders;


public interface RentalAndPurchaseRepository extends JpaRepository<rental_and_purchase_orders, Integer> {

	@Query("SELECT COUNT(a) FROM rental_and_purchase_orders a"
			+ " WHERE a.userName=:name AND a.RentedOrPurchased = 'R'"
			+ " AND a.BalancePaid <> 'Yes' ")
	Long getRentalCountForUser(@Param("name") String name);
	
	@Query("Select a FROM rental_and_purchase_orders a, movies b"
			+ " WHERE a.movieName = b.movieName "
			+ " AND b.Genre=:genre")
	List<rental_and_purchase_orders> findByGenre(@Param("genre") String genreName);
	
	List<rental_and_purchase_orders> findByMovieName(String movieName);
	
	List<rental_and_purchase_orders> findByUserName(String userName);
}
