package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Users;
import com.marcdev.rental_app.service.implServiceInterfaces.RankingImplService;

public class RankingService implements RankingImplService {

    @Override
    public boolean createLike(Users users) {
        return false;
    }

    @Override
    public boolean createDislike(Users users) {
        return false;
    }

    @Override
    public void deleteLike() {

    }

    @Override
    public void deleteDislike() {

    }

    @Override
    public int getLike() {
        return 0;
    }

    @Override
    public int getDislike() {
        return 0;
    }
}
