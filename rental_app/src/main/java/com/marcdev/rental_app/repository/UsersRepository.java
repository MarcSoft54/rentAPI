package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    public Optional<User> findByEmail(String email);
}
