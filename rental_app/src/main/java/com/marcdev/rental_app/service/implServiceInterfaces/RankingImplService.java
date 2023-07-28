package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Users;

public interface RankingImplService {

    boolean createLike(Users users);

    boolean createDislike(Users users);

    void deleteLike(Long id);

    void deleteDislike(Long id);

    Long getLike();

    Long getDislike();
}
