package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Users;

public interface RankingImplService {

    boolean createLike(Users users);

    boolean createDislike(Users users);

    void deleteLike();

    void deleteDislike();

    int getLike();

    int getDislike();
}
