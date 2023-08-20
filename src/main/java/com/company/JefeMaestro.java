package com.company;

public class JefeMaestro extends Spartan{

    private String habilidad;
    private String ia;

    public JefeMaestro(){
        super("Jefe Maestro", "Spartan II", "Verde", true);
        this.habilidad = "Suerte";
        this.ia = "Cortana";
    }

    @Override
    public void dispararEnemigos(){
        System.out.println("Cortana dame la cantidad de enemigos para aniquilarlos...");
    }

    @Override
    public String toString() {
        return "JefeMaestro{" +
                "nombre='" + this.getNombre() + '\'' +
                ", generacion='" + this.getGeneracion() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", activo=" + this.isActivo() +
                " habilidad='" + habilidad + '\'' +
                ", ia='" + ia + '\'' +
                '}';
    }
}
