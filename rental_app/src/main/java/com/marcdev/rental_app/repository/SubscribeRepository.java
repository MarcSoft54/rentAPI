package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Subscribe;
import com.marcdev.rental_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {

    Optional<Subscribe> findByMai(String user);
}
