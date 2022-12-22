package com.example.Proyecto.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
@ConfigurationProperties(prefix = "user")

public class UserPojo {
    private String email;
    private String age;
    private String password;

    public UserPojo(String email, String age, String password) {
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
