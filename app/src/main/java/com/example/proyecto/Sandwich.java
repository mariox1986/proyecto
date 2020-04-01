package com.example.proyecto;

import java.io.Serializable;

public class Sandwich implements Serializable{


    private String idImagen;
    private String nombre;
    private String descripcion;
    private String precio;

    public Sandwich() {
    }
    //Constructor
    public Sandwich(String idImagen, String nombre, String descripcion, String precio) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getIdImagen(){ return idImagen;}
    public String getNombre(){ return nombre;}
    public String getDescripcion(){return descripcion;}
    public String getPrecio(){return precio;}



}