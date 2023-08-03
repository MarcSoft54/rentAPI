package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.Comment;
import com.marcdev.rental_app.modelDto.CommentDTO;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class CommentMapper {

    public CommentDTO toDto(Comment comment){
        String content = comment.getContent();
        Timestamp createAt = comment.getCreateAt();

        return new CommentDTO(
                content,
                createAt
        );
    }
}
