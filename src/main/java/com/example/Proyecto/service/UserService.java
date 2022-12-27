package com.example.Proyecto.service;

import com.example.Proyecto.entity.User;
import com.example.Proyecto.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
private final Log LOG= LogFactory.getLog(UserService.class);
private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
@Transactional
    public void saveTransactional(List<User>users){
        users.stream()
                .peek(user->LOG.info("usuario insertado"+user))
                .forEach(userRepository::save);
    }
    public List<User>getAllUsers(){
        return userRepository.findAll();
    }

}
