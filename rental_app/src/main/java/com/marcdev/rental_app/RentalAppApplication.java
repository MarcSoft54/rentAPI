package com.marcdev.rental_app;

import com.marcdev.rental_app.controller.UserController;
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

		UserDTO userDTO = new UserDTO();

		UserController userController = new UserController();

		userDTO.setCountry("Cameroun");
		userDTO.setPhoneNumber(657284175L);
		userDTO.setSex("Male");
		userDTO.setUsername("Marc dev");
		userDTO.setSurname("William");
		userDTO.setMail("marcdev@gmail.com");
		userDTO.setPassWord("marcdev");

		userController.createUser(userDTO);
	}
}
