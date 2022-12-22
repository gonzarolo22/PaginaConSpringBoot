package com.example.Proyecto.bean;

public class Persona implements Nombre{

    private edad edad;


    public Persona(edad edad) {
        this.edad = edad;
    }


    @Override
    public void escribirNombre() {

        System.out.println("mi nombre es gonzalo");
    }
}
