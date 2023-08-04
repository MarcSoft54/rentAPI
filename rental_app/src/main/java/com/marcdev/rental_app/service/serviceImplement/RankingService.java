package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.RankingDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Ranking;
import com.marcdev.rental_app.repository.ArticleRepository;
import com.marcdev.rental_app.repository.RankingRepository;
import com.marcdev.rental_app.repository.UsersRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.RankingImplService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RankingService implements RankingImplService {

    RankingRepository rankingRepository;

    UsersRepository usersRepository;

    ArticleRepository articleRepository;

    @Override
    public boolean createLike(RankingDTO ranking, User user, Article article) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        Optional<Article> article1 = articleRepository.findById(article.getId());
        if(user1.isPresent() && article1.isPresent()){
            var like = Ranking.builder()
                    .likes(ranking.getLike())
                    .user(new User())
                    .article(new Article())
                    .build();
            rankingRepository.save(like);
            return true;
        }
        return false;
    }

    @Override
    public boolean createDislike(RankingDTO ranking, User user, Article article) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        Optional<Article> article1 = articleRepository.findById(article.getId());
        if(user1.isPresent() && article1.isPresent()) {
            var dislike = Ranking.builder()
                    .dislike(ranking.getDislike())
                    .article(new Article())
                    .user(new User())
                    .build();
            rankingRepository.save(dislike);
        return true;
        }
        return false;
    }
    @Override
    public void deleteLike( User user) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        if(user1.isPresent()) {
            rankingRepository.deleteAll();
        }
    }

    @Override
    public void deleteDislike(User user) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        if(user1.isPresent()) {
            rankingRepository.deleteAll();
        }
    }

    @Override
    public Long getLike() {
        return rankingRepository.count();
    }

    @Override
    public Long getDislike() {
        return rankingRepository.count();
    }
}
