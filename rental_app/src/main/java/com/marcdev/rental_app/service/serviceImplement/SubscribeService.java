package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Users;
import com.marcdev.rental_app.repository.SubscribeRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.SubscribeImplService;
import org.springframework.beans.factory.annotation.Autowired;

public class SubscribeService implements SubscribeImplService {

    @Autowired
    SubscribeRepository subscribeRepository;


    @Override
    public boolean createSubscribe(boolean bool) {
        return false;
    }

    @Override
    public void deleteSubscribe(Long id) {
            subscribeRepository.deleteById(id);
    }

    @Override
    public Long getSubscribe() {
        return subscribeRepository.count();
    }
}
