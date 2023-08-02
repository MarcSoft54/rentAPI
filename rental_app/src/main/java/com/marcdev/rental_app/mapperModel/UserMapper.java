package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO toDto( User user){
        String username = user.getUsername();
        String surname = user.getSurname();

        return new UserDTO( );
    }

}
