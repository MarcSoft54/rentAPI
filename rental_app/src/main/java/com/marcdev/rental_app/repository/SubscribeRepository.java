package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Subscribe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeRepository extends CrudRepository<Subscribe, Long> {
}
