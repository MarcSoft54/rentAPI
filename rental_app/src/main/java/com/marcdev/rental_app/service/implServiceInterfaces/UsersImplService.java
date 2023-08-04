package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.auth.AuthentificationRequest;
import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;

import java.util.Optional;

public interface UsersImplService {
    AuthentificationResponse createUser(UserDTO account);

    void deleteUsers(AuthentificationRequest request);

    AuthentificationResponse updateUsers(AuthentificationRequest request, User user);

    AuthentificationResponse login(AuthentificationRequest request);

    public Optional getUser(String email);
}
