package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.modelDto.RankingDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Ranking;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.RankingRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.RankingImplService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RankingService implements RankingImplService {

    RankingRepository rankingRepository;

    @Override
    public boolean createLike(RankingDTO ranking) {
        var like = Ranking.builder()
                .like(ranking.getLike())
                .user(new User())
                .article(new Article())
                .build();
        rankingRepository.save(like);
        return true;
    }

    @Override
    public boolean createDislike(RankingDTO ranking) {
        var dislike = Ranking.builder()
                .dislike(ranking.getDislike())
                .article(new Article())
                .user(new User())
                .build();
        rankingRepository.save(dislike);
        return false;
    }

    @Override
    public void deleteLike(RankingDTO ranking) {
        Optional<Ranking> ranking1 = rankingRepository.getLike(ranking.getLike());
        if (ranking1.isPresent()){
            rankingRepository.deleteAll();
        }
    }

    @Override
    public void deleteDislike(RankingDTO ranking) {
        Optional<Ranking> ranking1 = rankingRepository.getDislike(ranking.getDislike());
        if(ranking1.isPresent()){
            rankingRepository.deleteAll();
        }
    }


    @Override
    public Long getLike() {
        return rankingRepository.getCountLike();
    }

    @Override
    public Long getDislike() {
        return rankingRepository.count();
    }
}
