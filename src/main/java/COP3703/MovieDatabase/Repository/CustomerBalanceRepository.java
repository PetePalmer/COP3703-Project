package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.customer_balances;

public interface CustomerBalanceRepository extends JpaRepository<customer_balances, Integer>{

	customer_balances findByUserName(String userName);
}
