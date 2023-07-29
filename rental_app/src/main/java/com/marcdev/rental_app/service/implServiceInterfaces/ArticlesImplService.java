package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Article;

import java.util.Optional;

public interface ArticlesImplService {
    Article createArticle(Article article);

    void deleteArticle(Article article);

    void updateArticle(Article article);

    Optional<Article> searchArticle(Long id);

    Iterable<Article> getArticles();

}
