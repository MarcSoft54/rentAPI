package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Commenter;
import com.marcdev.rental_app.repository.CommentRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.CommentImplServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServices implements CommentImplServices {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public Commenter createComment(Commenter commenter) {
        return commentRepository.save(commenter);
    }

    @Override
    public Iterable<Commenter> getComment() {
        return commentRepository.findAll();
    }
}
