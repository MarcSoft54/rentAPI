package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {

}
