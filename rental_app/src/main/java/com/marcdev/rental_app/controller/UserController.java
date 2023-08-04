package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.auth.AuthentificationRequest;
import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.modelDto.UserDTO;
import com.marcdev.rental_app.service.serviceImplement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;

    @PostMapping("/signup")
    @ResponseBody
    public void signUp(@RequestParam ("UserDTO")UserDTO userDTO){
        ResponseEntity.ok(
                userService.createUser(userDTO)
        );
    }

    @GetMapping("/user")
    @ResponseBody
    public ResponseEntity<Optional<User>> getUsers(@RequestParam ("email")String email){
        return ResponseEntity.ok(
                userService.getUser(email)
        );
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthentificationResponse> login(@RequestParam ("request")AuthentificationRequest request){
        return ResponseEntity.ok(
                userService.login(request)
        );
    }

    @PostMapping("/update")
    public ResponseEntity<AuthentificationResponse> updateUsers(@RequestParam ("request")AuthentificationRequest request, @RequestParam ("userDTO")UserDTO userDTO){
        var users = userMapper.toUser(userDTO);
        return ResponseEntity.ok(
                userService.updateUsers(request, users)
        );
    }



}
