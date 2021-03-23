package com.simplejwt.simplejwt;

import com.simplejwt.simplejwt.domain.User;
import com.simplejwt.simplejwt.domain.enums.Profile;
import com.simplejwt.simplejwt.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SimpleJwtApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "user1@email.com", bcrypt.encode("123"));
		User user2 = new User(null, "user2@email.com", bcrypt.encode("123"));
		user2.addProfile(Profile.ADM);
		userRepository.save(user1);
		userRepository.save(user2);
	}

}
