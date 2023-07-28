package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Articles;
import com.marcdev.rental_app.model.Users;

public interface SubscribeImplService {

    Users createSubscribe(Articles articles);

    void deleteSubscribe(Users users);
}
