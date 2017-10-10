package com.gestionrural.meirelles.gestionrural;

/**
 * Created by zimin on 2/10/2017.
 */

public class Vacuno {
    private int numeroCaravana;
    private int firma;
    private boolean prenada;
    private double peso;
    private int edad;
    private String notas;

    public Vacuno(int numeroCaravana, int firma, boolean prenada, double peso, int edad, String notas) {
        this.numeroCaravana = numeroCaravana;
        this.firma = firma;
        this.prenada = prenada;
        this.peso = peso;
        this.edad = edad;
        this.notas = notas;
    }

    public int getNumeroCaravana() {
        return numeroCaravana;
    }

    public void setNumeroCaravana(int numeroCaravana) {
        this.numeroCaravana = numeroCaravana;
    }

    public int getFirma() {
        return firma;
    }

    public void setFirma(int firma) {
        this.firma = firma;
    }

    public boolean getPrenada() {
        return prenada;
    }

    public void setPrenada(boolean prenada) {
        this.prenada = prenada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
