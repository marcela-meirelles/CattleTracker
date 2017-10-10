package com.gestionrural.meirelles.gestionrural;

import android.support.annotation.RequiresPermission;

import java.util.ArrayList;

/**
 * Created by zimin on 6/10/2017.
 */

public class Firma {
    private int numero;
    private String nombre;

    private ArrayList<Vacuno> listaCaravanas = new ArrayList<Vacuno>();

    public Firma(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public Firma(int numero) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarListaCaravanas(){
        byte[] data = yourpdf;
        ParseFile file = new ParseFile("filename.pdf", data);

        ParseObject test = new ParseObject("TestPdf");
        test.put("name", "CV");
        test.put("pdfFile", file);
        test.saveInBackground();
    }
}
