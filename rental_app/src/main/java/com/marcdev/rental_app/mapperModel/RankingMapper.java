package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.Ranking;
import com.marcdev.rental_app.modelDto.RankingDTO;
import org.springframework.stereotype.Component;

@Component
public class RankingMapper {

    public RankingDTO toDto(Ranking ranking){
        int like = ranking.getLikes();
        int dislike = ranking.getDislike();
        return new RankingDTO(like, dislike);
    }

    public Ranking toRanking(RankingDTO rankingDTO){
        return new Ranking(
                rankingDTO.getLike(),
                rankingDTO.getDislike()
        );
    }
}
