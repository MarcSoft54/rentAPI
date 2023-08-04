package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Message;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;

public interface MessageImplService {

    void createMessage(UserDTO user, Message message);

    Iterable<Message> getMessage(User user);
}
