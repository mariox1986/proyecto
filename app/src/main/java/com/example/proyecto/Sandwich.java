package com.example.proyecto;

import java.io.Serializable;

public class Sandwich implements Serializable{



    private String nombre;
    private String descripcion;
    private String precio;

    public Sandwich() {
    }
    //Constructor
    public Sandwich(String nombre, String descripcion, String precio) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public String getNombre(){ return nombre;}
    public String getDescripcion(){return descripcion;}
    public String getPrecio(){return precio;}



}