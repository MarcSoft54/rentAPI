package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.auth.CreateArticle;
import com.marcdev.rental_app.model.Article;

import java.util.Optional;

public interface ArticlesImplService {
    String createArticle(CreateArticle article);

    void deleteArticle(Article article);

    AuthentificationResponse updateArticle(Article article);

    Optional<Article> searchArticle(Long id);

    Iterable<Article> getArticles();

}
