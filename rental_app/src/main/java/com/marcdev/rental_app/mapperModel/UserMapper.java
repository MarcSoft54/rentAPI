package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
@Data
public class UserMapper {

    @Bean
    public UserDTO toGetUserDto(User user){
        String username = user.getUsername();
        String surname = user.getSurname();
        String email = user.getEmail();
        String country = user.getCountry();
        Long phoneNumber = user.getPhoneNumber();
        String sex = user.getSex();

        return new UserDTO(username, surname, email,
                country, phoneNumber, sex);
    }


    @Bean
    public UserDTO toCreateUserDto(UserDTO userDTO){
        return new UserDTO(
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
