package com.gestionrural.meirelles.gestionrural;

import java.util.ArrayList;

/**
 * Created by zimin on 2/10/2017.
 */

public class GestoraVacunos {
    private ArrayList<Vacuno> lista_vacunos = new ArrayList<Vacuno>();

    // Singleton
    private static GestoraVacunos gv = null;

    private GestoraVacunos(){
        lista_vacunos = new ArrayList<>();
    }

    public static GestoraVacunos getInstance(){
        if(gv == null){
            gv = new GestoraVacunos();
        }
        return gv;
    }
    // final Singleton

    public void agregarVacunoALista(Vacuno v){
        lista_vacunos.add(v);
    }

    public ArrayList listarVacunosIngresados(){
        return (ArrayList<Vacuno>)lista_vacunos.clone();
    }
}
