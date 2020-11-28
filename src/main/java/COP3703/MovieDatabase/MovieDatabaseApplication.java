package COP3703.MovieDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "COP3703.MovieDatabase")
@EnableJpaRepositories(basePackages = "COP3703.MovieDatabase.Repository")
public class MovieDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDatabaseApplication.class, args);
	}

}
