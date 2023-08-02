package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.model.Article;

import java.util.Optional;

public interface ArticlesImplService {
    String createArticle(ArticleDTO article);

    void deleteArticle(Article article);

    String updateArticle(Article article);

    Optional<Article> searchArticle(Article article);

    Iterable<Article> getArticles();

}
