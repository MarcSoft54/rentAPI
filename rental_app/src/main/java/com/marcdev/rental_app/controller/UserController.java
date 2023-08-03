package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.service.serviceImplement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    UserService userService;
    UserMapper mapper;

    @PostMapping("/user")
    @ResponseBody
    public void createUser(@RequestBody User users){
        var user = mapper.toDto(users);
        userService.createUser(user);
    }

    @GetMapping("/seeUser")
    @ResponseBody
    public void getUsers(){
        userService.getUser();
    }

}
