package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Message;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.MessageRepository;
import com.marcdev.rental_app.repository.UsersRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.MessageImplService;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

public class MessageService implements MessageImplService {

    MessageRepository messageRepository;
    UsersRepository usersRepository;

    @Override
    public void createMessage(User user, Message message) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        if(user1.isPresent()){
            var messages = Message.builder()
                    .content(message.getContent())
                    .user(message.getUser())
                    .createAt(Timestamp.valueOf(LocalDateTime.now()))
                    .build();
            messageRepository.save(messages);
        }
    }

    @Override
    public Iterable<Message> getMessage(User user) {
        Optional<User> user1 = usersRepository.findByEmail(user.getEmail());
        if(user1.isPresent()){
            return messageRepository.findAll();
        }
        return null;
    }
}
