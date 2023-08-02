package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.modelDto.RankingDTO;

public interface RankingImplService {

    boolean createLike(RankingDTO ranking);

    boolean createDislike(RankingDTO ranking);

    void deleteLike(RankingDTO ranking);

    void deleteDislike(RankingDTO ranking);

    Long getLike();

    Long getDislike();
}
