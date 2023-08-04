package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.auth.AuthentificationRequest;
import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.modelDto.UserDTO;
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
public class UserService implements UsersImplService {


    private UsersRepository usersRepository;
    private AuthenticationManager manager;


    @Override
    public AuthentificationResponse createUser(UserDTO account) {
        Optional<User> user1 = usersRepository.findByEmail(account.getMail());
        if (user1.isPresent()) {
            System.out.println("here...is giving...");
            return AuthentificationResponse.builder().token("isPresent").build();
        } else {
            var users = User.builder()
                    .username(account.getUsername())
                    .email(account.getMail())
                    .surname(account.getUsername())
                    .sex(account.getSex())
                    .country(account.getCountry())
                    .passWord(account.getPassWord())
                    .role(Role.ADMIN)
                    .phoneNumber(account.getPhoneNumber())
                    .messages(new Message().getUser().getMessages())
                    .comment(new Comment().getUser().getComment())
                    .article(new Article().getUser().getArticle())
                    .subscribe(new Subscribe().getUser().getSubscribe())
                    .ranking(new Ranking().getUser().getRanking())
                    .build();
            usersRepository.save(users);

            return AuthentificationResponse.builder().token("Create successfully").build();
        }
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
            user1.get().setUsername(user.getUsername());
            user1.get().setPassWord(user.getPassWord());
            user1.get().setSurname(user.getSurname());
            user1.get().setEmail(user.getEmail());
            user1.get().setPhoneNumber(user.getPhoneNumber());

            usersRepository.save(user1.get());
            return AuthentificationResponse.builder().token("update successfully").build();
        }
        return AuthentificationResponse.builder().token("update not available").build();
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
        return AuthentificationResponse.builder().token("login success").build();
    }

    @Override
    public Optional<User> getUser(String email) {
        return usersRepository.findByEmail(email);
    }

}
