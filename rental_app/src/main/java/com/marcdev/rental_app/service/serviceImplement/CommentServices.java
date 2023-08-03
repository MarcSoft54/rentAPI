package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.modelDto.CommentDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Comment;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.ArticleRepository;
import com.marcdev.rental_app.repository.CommentRepository;
import com.marcdev.rental_app.repository.UsersRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.CommentImplServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommentServices implements CommentImplServices {

   CommentRepository commentRepository;
   UsersRepository usersRepository;
   ArticleRepository articleRepository;

    @Override
    public void createComment(User user,CommentDTO commentDTO) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        if(user1.isPresent()){
            var comment = Comment.builder()
                    .content(commentDTO.getContent())
                    .user(new User())
                    .article(new Article())
                    .createAt(Timestamp.valueOf(LocalDateTime.now()))
                    .build();
            commentRepository.save(comment);
        }
    }

    @Override
    public Iterable<Comment> getComment(Article article) {
        Optional<Article> article1 = articleRepository.findById(article.getId());
        if (article1.isPresent()){
            return commentRepository.findAll();
        }
        return null;
    }
}
