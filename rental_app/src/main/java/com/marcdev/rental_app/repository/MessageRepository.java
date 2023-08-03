package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
