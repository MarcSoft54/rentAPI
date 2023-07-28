package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Users;

import java.security.Principal;

public interface UsersImplService {
    Users createUser(Users users, String mail);

    void deleteUsers(Long id);

    void updateUsers(Users users);


}
