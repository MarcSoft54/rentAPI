package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.User;

public interface RankingImplService {

    boolean createLike(User user);

    boolean createDislike(User user);

    void deleteLike(Long id);

    void deleteDislike(Long id);

    Long getLike();

    Long getDislike();
}
