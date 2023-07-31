package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.auth.AuthentificationRequest;
import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.auth.CreateAccount;
import com.marcdev.rental_app.config.JwtService;
import com.marcdev.rental_app.model.*;
import com.marcdev.rental_app.repository.UsersRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.UsersImplService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsersService implements UsersImplService {

    UsersRepository usersRepository;
    private AuthenticationManager manager;
    private JwtService jwtService;

    @Override
    public AuthentificationResponse createUser(CreateAccount account) {
        Optional<User> user1 = usersRepository.findByEmail(account.getMail());
        if(user1.isPresent()){
            return AuthentificationResponse.builder().token("isPresent").build();
        }
        var users = User.builder()
                .username(account.getUsername())
                .email(account.getMail())
                .surname(account.getUsername())
                .sex(account.getSex())
                .country(account.getCountry())
                .password(account.getPassWord())
                .role(Role.ADMIN)
                .phone_number(account.getPhone_number())
                .commenters(new Commenter().getUser().getCommenters())
                .articles(new Article().getUser().getArticles())
                .subscribes(new Subscribe().getUser().getSubscribes())
                .rankings(new Ranking().getUser().getRankings())
                .build();

        var jwtServices = jwtService.genereToken(users);
      return  AuthentificationResponse.builder().token(jwtServices).build();
    }

    @Override
    public void deleteUsers(AuthentificationRequest request) {
        Optional<User> user1 = usersRepository.findByEmail(request.getEmail());
        if (user1.isPresent()){
            usersRepository.deleteAll();
        }
    }

    @Override
    public AuthentificationResponse updateUsers(AuthentificationRequest request, User user) {
        Optional<User> user1 = usersRepository.findByEmail(request.getEmail());
        if(user1.isPresent()){
            user.setPassword(user.getPassword());
            user.setEmail(user.getEmail());
            user.setCountry(user.getCountry());
            user.setPhone_number(user.getPhone_number());
            user.setUsername(user.getUsername());
            user.setSurname(user.getSurname());

            usersRepository.save(user);
        }
        var jwtServices = jwtService.genereToken(user);
        return AuthentificationResponse.builder().token(jwtServices).build();


    }

    @Override
    public AuthentificationResponse login(AuthentificationRequest request) {
        manager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user =  usersRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtServices = jwtService.genereToken(user);

        return AuthentificationResponse.builder().token(jwtServices).build();
    }

}
