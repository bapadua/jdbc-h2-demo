package io.github.solucaologica.jdbc.jdbcdemoh2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.solucaologica.jdbc.jdbcdemoh2.entity.User;
import io.github.solucaologica.jdbc.jdbcdemoh2.repository.UserRepository;

@SpringBootApplication
public class JdbcDemoH2Application implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoH2Application.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("Bruno");
		user.setLastName("Padua");
		user.setAddress("06622640");
		
		this.userRepository.save(user);
	}

}
