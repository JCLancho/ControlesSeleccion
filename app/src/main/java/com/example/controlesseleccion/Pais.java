package com.example.controlesseleccion;

public class Pais {

    private String nombre;
    private int superficie;

    public Pais(String nombre, int superficie){
        this.nombre = nombre;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString(){
        return this.nombre;
    }



}
