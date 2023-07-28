package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.Users;

public interface UsersImplService {
    Users createUser(Users users);

    void deleteUsers(Long id);

    void updateUsers(Users users);


}
