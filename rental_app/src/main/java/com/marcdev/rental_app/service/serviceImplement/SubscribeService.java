package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Subscribe;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.SubscribeRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.SubscribeImplService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SubscribeService implements SubscribeImplService {

   private SubscribeRepository subscribeRepository;

    @Override
    public boolean createSubscribe(boolean bool, User user) {
        Optional<Subscribe> subscribe = subscribeRepository.findByMai(user.getEmail());
        if(subscribe.isPresent()){
            return false;
        }else {
            var sub = Subscribe.builder()
                    .user(new User())
                    .subscribeAt(Timestamp.valueOf(LocalDateTime.now()))
                    .build();
            subscribeRepository.save(sub);
            return true;
        }


    }

    @Override
    public boolean deleteSubscribe(User user) {
        Optional<Subscribe> subscribe = subscribeRepository.findByMai(user.getEmail());
        if (subscribe.isPresent()){
            subscribeRepository.deleteById(subscribe.get().getId());
            return true;
        }
        return false;
    }

    @Override
    public Long getSubscribe() {
        return subscribeRepository.count();
    }
}
