package com.alilopez.application.models;

public class Flores {
    protected String nombre;
    protected int cantidad;
    protected int precio;

    public Flores(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public Flores(){}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCantidad(int cantidad) {this.cantidad = this.cantidad - cantidad;}
    public void setPrecio(int precio) {this.precio = precio;}
    public String getNombre() {return nombre;}
    public int getCantidad() {return cantidad;}
    public int getPrecio() {return precio;}
}
