package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Commenter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Commenter, Long> {
}
