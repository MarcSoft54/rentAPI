package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Message;
import com.marcdev.rental_app.model.User;

public interface MessageImplService {

    void createMessage(User user, Message message);

    Iterable<Message> getMessage(User user);
}
