package COP3703.MovieDatabase.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.employees;

public interface EmployeesRepository extends JpaRepository<employees, Integer>{

}
