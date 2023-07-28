package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Articles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends CrudRepository<Articles, Long> {
}
