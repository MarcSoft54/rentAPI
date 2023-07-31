package com.marcdev.rental_app.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class CreateAccount{

    private String username;
    private String mail;
    private String passWord;
    private String surname;
    private String sex;
    private Long phone_number;
    private String country;
    private String role;



}
