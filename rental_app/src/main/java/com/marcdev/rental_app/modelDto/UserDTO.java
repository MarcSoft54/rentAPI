package com.marcdev.rental_app.modelDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class UserDTO {

    private String username;
    private String mail;
    private String passWord;
    private String surname;
    private String sex;
    private Long phoneNumber;
    private String country;
    private String role;

    public UserDTO(String username,
                   String surname,
                   String email,
                   String country,
                   Long phoneNumber,
                   String sex) {
    }
}
