package com.marcdev.rental_app;

import com.marcdev.rental_app.controller.UserController;
import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
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

		UserDTO marc = new UserDTO(
				"Marc",
				"dev",
				"marcdev@dev.com",
				"marcdev",
				"male",
				655090313,
				"Cameroun",
				"NULL"
		);

		UserController user = new UserController();
		user.signUp(marc);
	}
}
