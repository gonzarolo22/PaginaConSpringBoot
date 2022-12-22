package com.example.Proyecto.Configuration;

import com.example.Proyecto.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfiguration {


    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependencie beanOperationOperationtwo(MyOperation myOperation){
        return new MyBeanWithDependencieImplement(myOperation);
    }

    @Bean
    public edad edad(){
        return new implementEdad();
    }

    @Bean
    public Nombre nombre(edad edad){
        return new Persona(edad);
    }

}
