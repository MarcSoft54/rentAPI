package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.RankingDTO;

public interface RankingImplService {

    boolean createLike(RankingDTO ranking, User user, Article article);

    boolean createDislike(RankingDTO ranking, User user, Article article);

    void deleteLike(User user);

    void deleteDislike(RankingDTO ranking);

    Long getLike();

    Long getDislike();
}
