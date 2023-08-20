package com.company;

public class Main {
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan();
        spartan1.setNombre("Harvey");
        spartan1.setGeneracion("Spartan II");
        spartan1.setColor("Verde");
        spartan1.setActivo(true);

        System.out.println(spartan1.toString());
        spartan1.dispararEnemigos();

        //Jefe Maestro
        JefeMaestro jefeMaestro = new JefeMaestro();
        System.out.println(jefeMaestro.toString());
        jefeMaestro.dispararEnemigos();
    }
}