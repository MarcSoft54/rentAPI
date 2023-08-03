package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.ArticleMapper;
import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.service.serviceImplement.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ArticlesController {

    ArticleMapper articleMapper;
    ArticleService articleService;

    @GetMapping("/see")
    public Iterable<Article> getArticle(){
        return articleService.getArticles();
    }

    @PostMapping("/")
    public void postArticle(ArticleDTO article){
        articleService.createArticle(article);
    }

    @GetMapping("/search")
    public Optional<Article> searchArticle(Long id){
        return articleService.searchArticle(id);
    }

    @PostMapping("/del")
    public void deleteArticle(ArticleDTO article){
        var articleDel = articleMapper.toArticle(article);
        articleService.deleteArticle(articleDel);
    }

}
