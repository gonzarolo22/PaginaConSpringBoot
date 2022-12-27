package com.example.Proyecto.Configuration;

import com.example.Proyecto.caseUse.getUser;
import com.example.Proyecto.caseUse.getUserImplement;
import com.example.Proyecto.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaseUseConfiguration {
    @Bean
    getUser GetUser(UserService userService){
        return new getUserImplement(userService);
    }
}
