package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.customers;

public interface CustomersRepository extends JpaRepository<customers, String> {

}
