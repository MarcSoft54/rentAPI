package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.ArticleMapper;
import com.marcdev.rental_app.mapperModel.CommentMapper;
import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.Comment;
import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.modelDto.UserDTO;
import com.marcdev.rental_app.service.serviceImplement.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommentController {

    CommentServices commentServices;
    ArticleMapper articleMapper;
    CommentMapper commentMapper;
    UserMapper userMapper;

    @GetMapping("/seeComment")
    public Iterable<Comment> getComments(ArticleDTO articleDTO){
        var article = articleMapper.toArticle(articleDTO);
        return commentServices.getComment(article);
    }

    @PostMapping("/createComment")
    public void createComment(UserDTO userDTO, Comment comment){
        var user = userMapper.toUser(userDTO);
        var comments = commentMapper.toDto(comment);
        commentServices.createComment(user, comments);
    }
}
