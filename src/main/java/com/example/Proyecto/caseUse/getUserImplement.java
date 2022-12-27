package com.example.Proyecto.caseUse;

import com.example.Proyecto.entity.User;
import com.example.Proyecto.service.UserService;

import java.util.List;

public class getUserImplement implements getUser{
private UserService userService;

public getUserImplement(UserService userService){
    this.userService=userService;
}
    @Override
    public List<User> getAll() {
        return userService.getAllUsers();
    }

}
