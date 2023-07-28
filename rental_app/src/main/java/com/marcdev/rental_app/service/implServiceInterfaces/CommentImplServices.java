package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Commenter;

public interface CommentImplServices {
    Commenter createComment(Commenter commenter);

    Iterable<Commenter> getComment();
}
