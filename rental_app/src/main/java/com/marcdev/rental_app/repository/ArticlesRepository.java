package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {
    Optional<Article> findByArticle(Article article);
}
