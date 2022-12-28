package com.example.Proyecto.caseUse;

import com.example.Proyecto.entity.User;
import com.example.Proyecto.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUpdate {
    private UserService userService;

    public CreateUpdate(UserService userService) {
        this.userService = userService;
    }

    public User update(User newUser, Long id){
        return userService.update(newUser,id);

    }
}
