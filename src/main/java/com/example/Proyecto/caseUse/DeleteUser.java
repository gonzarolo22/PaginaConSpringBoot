package com.example.Proyecto.caseUse;

import com.example.Proyecto.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DeleteUser {
    UserService userService;

    public DeleteUser(UserService userService) {
        this.userService = userService;
    }

    public void remove (Long id){
        userService.delete(id);
    }
}
