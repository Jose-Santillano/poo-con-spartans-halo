package com.company;

public class Spartan {

    //Atributos
    private String nombre;
    private String generacion;
    private String color;
    private boolean activo;

    //Constructor
    public Spartan(){

    }

    public Spartan(String nombre, String generacion, String color, boolean activo) {
        this.nombre = nombre;
        this.generacion = generacion;
        this.color = color;
        this.activo = activo;
    }

    //Metodos
    public void dispararEnemigos(){
        System.out.println("Disparando contra objetivos del Covenant...");
    }

    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "nombre='" + nombre + '\'' +
                ", generacion='" + generacion + '\'' +
                ", color='" + color + '\'' +
                ", activo=" + activo +
                '}';
    }
}
