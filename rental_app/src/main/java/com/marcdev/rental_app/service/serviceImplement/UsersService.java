package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.User;
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
    public User createUser(User user, String mail) {
        return usersRepository.save(user);
    }

    @Override
    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public void updateUsers(User user) {
        usersRepository.save(user);
    }
}
