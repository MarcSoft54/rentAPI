package com.marcdev.rental_app;

import com.marcdev.rental_app.auth.CreateArticle;
import com.marcdev.rental_app.controller.ArticlesController;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.service.serviceImplement.ArticlesService;
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
