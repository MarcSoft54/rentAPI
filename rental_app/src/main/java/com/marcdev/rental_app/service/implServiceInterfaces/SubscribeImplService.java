package com.marcdev.rental_app.service.implServiceInterfaces;


import com.marcdev.rental_app.model.User;

public interface SubscribeImplService {

    boolean createSubscribe(boolean bool, User user);

    boolean deleteSubscribe(User user);

    Long getSubscribe();
}
