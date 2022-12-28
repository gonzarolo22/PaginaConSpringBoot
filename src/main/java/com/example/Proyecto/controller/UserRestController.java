package com.example.Proyecto.controller;

import com.example.Proyecto.caseUse.CreateUpdate;
import com.example.Proyecto.caseUse.CreateUser;
import com.example.Proyecto.caseUse.DeleteUser;
import com.example.Proyecto.caseUse.getUser;
import com.example.Proyecto.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private CreateUser createUser;
    private getUser getuser;
    private DeleteUser deleteUser;
    private CreateUpdate createUpdate;

    public UserRestController(CreateUpdate createUpdate ,getUser getuser, CreateUser createUser, DeleteUser deleteUser) {
        this.getuser = getuser;
        this.createUser=createUser;
        this.deleteUser=deleteUser;
        this.createUpdate=createUpdate;
    }

    @GetMapping("/")
    List<User>get(){
        return getuser.getAll();
    }

    @PostMapping("/")
    ResponseEntity<User>newUser(@RequestBody User newUser){
        return new ResponseEntity<>(createUser.save(newUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteUser(@PathVariable Long id){
        deleteUser.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    ResponseEntity<User>replaceUser(@RequestBody User newUser, @PathVariable Long id){
        return new ResponseEntity<>(createUpdate.update(newUser, id), HttpStatus.OK);

    }

}
