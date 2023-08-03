package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.service.serviceImplement.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article")
public class ArticlesController {

    ArticleService articleService;
    @GetMapping()
    public Iterable<Article> getArticle(){
        return articleService.getArticles();
    }

    @PostMapping
    public void postArticle(ArticleDTO article){
        articleService.createArticle(article);
    }
}
