package COP3703.MovieDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import COP3703.MovieDatabase.Model.actors;

public interface ActorRepository extends JpaRepository<actors, Integer>{

}
