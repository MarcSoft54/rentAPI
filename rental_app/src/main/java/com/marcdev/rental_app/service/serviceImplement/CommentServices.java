package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.modelDto.CommentDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Comment;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.CommentRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.CommentImplServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CommentServices implements CommentImplServices {

    CommentRepository commentRepository;

    @Override
    public void createComment(CommentDTO commenter) {
        var comment = Comment.builder()
                .content(commenter.getContent())
                .user(new User())
                .article(new Article())
                .createAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();
        commentRepository.save(comment);
    }

    @Override
    public Iterable<Comment> getComment() {
        return commentRepository.findAll();
    }
}
