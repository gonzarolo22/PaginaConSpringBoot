package com.example.Proyecto.controller;

import com.example.Proyecto.caseUse.getUser;
import com.example.Proyecto.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private getUser getuser;

    public UserRestController(getUser getuser) {
        this.getuser = getuser;
    }

    @GetMapping("/")
    List<User>get(){
        return getuser.getAll();
    }
}
