package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.repository.ArticlesRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.ArticlesImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticlesService implements ArticlesImplService {

    @Autowired
    ArticlesRepository articlesRepository;

    @Override
    public Article createArticle(Article article) {
        return articlesRepository.save(article);
    }

    @Override
    public void deleteArticle(Article article) {
            articlesRepository.delete(article);
    }

    @Override
    public void updateArticle(Article article) {
        articlesRepository.save(article);
    }

    @Override
    public Optional<Article> searchArticle(Long id) {
        return articlesRepository.findById(id);
    }

    @Override
    public Iterable<Article> getArticles() {
        return articlesRepository.findAll();
    }

}
