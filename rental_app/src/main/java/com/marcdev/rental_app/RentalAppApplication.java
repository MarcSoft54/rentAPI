package com.marcdev.rental_app;

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

	}
}
