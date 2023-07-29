package com.marcdev.rental_app.service.implServiceInterfaces;

import com.marcdev.rental_app.model.User;

public interface UsersImplService {
    User createUser(User user, String mail);

    void deleteUsers(Long id);

    void updateUsers(User user);


}
