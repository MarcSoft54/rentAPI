package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.auth.CreateArticle;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.service.serviceImplement.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article")
public class ArticlesController {

    ArticlesService articlesService;
    @GetMapping()
    public Iterable<Article> getArticle(){
        return articlesService.getArticles();
    }

    @PostMapping
    public void postArticle(CreateArticle article){
        articlesService.createArticle(article);
    }
}
