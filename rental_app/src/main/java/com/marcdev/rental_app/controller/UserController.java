package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.service.serviceImplement.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UsersService usersService;
    @Autowired
    UserMapper mapper;

    @PostMapping
    @ResponseBody
    public void createUser(@RequestBody User users){
        var user = mapper.toDto(users);
        usersService.createUser(user);
    }

    @GetMapping
    @ResponseBody
    public void getUsers(){
        usersService.getUser();
    }



}
