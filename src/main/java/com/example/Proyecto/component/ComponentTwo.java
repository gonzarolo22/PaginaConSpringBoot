package com.example.Proyecto.component;

import org.springframework.stereotype.Component;

@Component

public class ComponentTwo implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("hola 2do componente");
    }
}
