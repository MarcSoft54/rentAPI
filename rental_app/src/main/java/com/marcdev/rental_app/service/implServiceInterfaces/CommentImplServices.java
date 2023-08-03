package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.CommentDTO;
import com.marcdev.rental_app.model.Comment;

public interface CommentImplServices {
    void createComment(User user, CommentDTO commenter);
    Iterable<Comment> getComment(Article article);
}
