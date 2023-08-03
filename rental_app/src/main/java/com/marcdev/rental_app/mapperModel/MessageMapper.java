package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.Message;
import com.marcdev.rental_app.modelDto.MessageDTO;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class MessageMapper {

    public MessageDTO toDto(Message message){
        String contents = message.getContent();
        Timestamp createAt = message.getCreateAt();
        return new MessageDTO(contents, createAt);
    }

    public Message toMessage(MessageDTO messageDTO){
        return new Message(
                messageDTO.getContent(),
                messageDTO.getCreateAt()
        );
    }

}
