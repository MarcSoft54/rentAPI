package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Users;
import com.marcdev.rental_app.repository.UsersRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.UsersImplService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Builder
public class UsersService implements UsersImplService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users createUser(Users users, String mail) {
        return usersRepository.save(users);
    }

    @Override
    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public void updateUsers(Users users) {
        usersRepository.save(users);
    }
}
