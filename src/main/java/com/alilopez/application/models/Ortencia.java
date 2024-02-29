package com.alilopez.application.models;

public class Ortencia extends Flores{
    public Ortencia(String nombre, int cantidad, int precio){
        super(nombre, cantidad, precio);
    }
    public Ortencia(){
        super();
    }

    @Override
    public String toString() {
        return "Ortencia{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio ;
    }
}
