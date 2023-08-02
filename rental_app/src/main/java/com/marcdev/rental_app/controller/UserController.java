package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.modelDto.UserDTO;
import com.marcdev.rental_app.service.serviceImplement.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired(required = false)
    UsersService usersService;
    @Autowired(required = false)
    UserMapper mapper;

    @PostMapping("/post")
    @ResponseBody
    public void createUser(@RequestBody UserDTO userDTO){
        var user = mapper.toCreateUserDto(userDTO);
        usersService.createUser(user);
    }

    @GetMapping("/get")
    @ResponseBody
    public void getUsers(){
        usersService.getUser();
    }


}
