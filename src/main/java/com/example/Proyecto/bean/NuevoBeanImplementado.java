package com.example.Proyecto.bean;

public class NuevoBeanImplementado implements NuevoBean{

    private String nombre;
    private String apellido;

    public NuevoBeanImplementado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String Function() {
        return nombre+"-"+apellido;
    }
}
