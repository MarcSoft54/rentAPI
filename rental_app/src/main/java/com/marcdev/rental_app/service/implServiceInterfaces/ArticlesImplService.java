package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Articles;

import java.util.Optional;

public interface ArticlesImplService {
    Articles createArticle(Articles articles);

    void deleteArticle(Articles articles);

    void updateArticle(Articles articles);

    Optional<Articles> searchArticle(Long id);

    Iterable<Articles> getArticles();

}
