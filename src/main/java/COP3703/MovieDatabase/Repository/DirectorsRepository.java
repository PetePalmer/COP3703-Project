package COP3703.MovieDatabase.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.directors;

public interface DirectorsRepository extends JpaRepository<directors, Integer>{

}
