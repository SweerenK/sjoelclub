package nl.sjoelclub.competitie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nl.sjoelclub.competitie.user.UserService;

@SpringBootApplication
public class CompetitieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompetitieApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserService userService) {
	    return (args) -> userService.initUsers();
	}

}

