package com.app.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.demo.model.User;
import com.app.demo.service.UserService;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(30000);
		
		User u1 = userService.getUserWithId(450);
		System.out.println("user name ===" + u1.getFirstname());
		System.out.println("user info ===" + u1.toString());

		User u2 = userService.getUserWithEmail("elippiettds@blogs.com");
		System.out.println("user name ===" + u2.getFirstname());
		System.out.println("user info ===" + u2.toString());

		User u3 = userService.getUserWithFirstname("Etti");
		System.out.println("user name ===" + u3.getFirstname());
		System.out.println("user info ===" + u3.toString());

		List<User> users = userService.getAllUsers();
		users.stream().forEach(user -> {
			System.out.println("user info ===" + user.toString());
		});
	}
}
