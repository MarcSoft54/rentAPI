package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.modelDto.CommentDTO;
import com.marcdev.rental_app.model.Comment;

public interface CommentImplServices {
    void createComment(CommentDTO commenter);
    Iterable<Comment> getComment();
}
