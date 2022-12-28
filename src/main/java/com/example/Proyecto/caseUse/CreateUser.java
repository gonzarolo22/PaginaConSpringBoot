package com.example.Proyecto.caseUse;

import com.example.Proyecto.entity.User;
import com.example.Proyecto.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService) {
        this.userService = userService;
    }
    public User save (User newUser){
        return userService.save(newUser);
    }
}
