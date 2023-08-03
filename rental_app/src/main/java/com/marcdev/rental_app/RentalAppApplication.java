package com.marcdev.rental_app;

import com.marcdev.rental_app.controller.UserController;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class RentalAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RentalAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();

		UserController userController = new UserController();

		user.setCountry("Cameroun");
		user.setPhoneNumber(657284175L);
		user.setSex("Male");
		user.setUsername("Marc dev");
		user.setSurname("William");
		user.setEmail("marcdev@gmail.com");
		user.setPassWord("marcdev");

		userController.createUser(user);

	}
}
