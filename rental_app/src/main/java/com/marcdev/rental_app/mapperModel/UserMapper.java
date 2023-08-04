package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
import org.springframework.stereotype.Component;



@Component
public class UserMapper {
    public UserDTO toDto(User user){
        String username = user.getUsername();
        String surname = user.getSurname();
        String email = user.getEmail();
        String country = user.getCountry();
        Long phoneNumber = user.getPhoneNumber();
        String sex = user.getSex();

        return new UserDTO(username, surname, email,
                country, phoneNumber, sex);
    }


    public User toUser(UserDTO userDTO){
        return new User(
                userDTO.getUsername(),
                userDTO.getSurname(),
                userDTO.getMail(),
                userDTO.getPassWord(),
                userDTO.getSex(),
                userDTO.getPhoneNumber(),
                userDTO.getCountry(),
                userDTO.getRole()
        );
    }

}
