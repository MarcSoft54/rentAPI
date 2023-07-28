package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Articles;
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
    public Articles createArticle(Articles articles) {
        return articlesRepository.save(articles);
    }

    @Override
    public void deleteArticle(Articles articles) {
            articlesRepository.delete(articles);
    }

    @Override
    public void updateArticle(Articles articles) {
        articlesRepository.save(articles);
    }

    @Override
    public Optional<Articles> searchArticle(Long id) {
        return articlesRepository.findById(id);
    }

    @Override
    public Iterable<Articles> getArticles() {
        return articlesRepository.findAll();
    }

}
