package com.marcdev.rental_app.service.implServiceInterfaces;


import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.SubscribeDTO;

public interface SubscribeImplService {

    boolean createSubscribe(boolean bool, User user, SubscribeDTO subscribeDTO);

    boolean deleteSubscribe(User user);

    Long getSubscribe();
}
