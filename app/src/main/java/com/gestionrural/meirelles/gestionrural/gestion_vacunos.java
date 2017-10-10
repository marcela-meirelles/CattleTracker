package com.gestionrural.meirelles.gestionrural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.gestionrural.meirelles.gestionrural.R.id.chkbxPrenada;
import static com.gestionrural.meirelles.gestionrural.R.id.spnrFirmas;
import static com.gestionrural.meirelles.gestionrural.R.id.txtNumeroCaravana;

public class gestion_vacunos extends AppCompatActivity {


    ExpandableListAdapterGR listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_vacunos);

        Intent intent = getIntent();

        Button btn_AgregarVacuno = (Button) findViewById(R.id.btnAgregarVacuno);
        btn_AgregarVacuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarVacuno();
            }
        });

        // contenido para spinner de firmas - luego debe ser una clase Firmas que llene el spinner
        Spinner sel_firma = (Spinner) findViewById(R.id.spnrFirmas);

        List<String> spinnerArrayFirmas =  new ArrayList<String>();
        spinnerArrayFirmas.add("Facundo");
        spinnerArrayFirmas.add("El Cerno");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArrayFirmas);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sel_firma.setAdapter(adapter);
        // termina contenido spinner Firmas

        // Contenido para spinner de edad
        Spinner sel_edad = (Spinner) findViewById(R.id.spnrEdad);

        List<String> spinnerArrayEdad =  new ArrayList<String>();
        spinnerArrayEdad.add("1");
        spinnerArrayEdad.add("2");

        ArrayAdapter<String> adapter_edad = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArrayEdad);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sel_edad.setAdapter(adapter_edad);
        // termina contenido spinner Edad
    }

    public int leerCaravana(){
        int numeroCaravana = 0;

        return numeroCaravana;
    }

    public void agregarVacuno() {
        int numeroCaravana;
        int firma;
        boolean prenada = false;
        double peso;
        int edad;
        String notas;
        Firma frm;

//        EditText num_caravana = (EditText) findViewById(R.id.txtNumeroCaravana);
//        numeroCaravana = Integer.parseInt(num_caravana.getText().toString());

        try{
            numeroCaravana = Integer.parseInt(((EditText) findViewById(R.id.txtNumeroCaravana)).getText().toString());
        }catch(Exception e){
            numeroCaravana = 000000000;
        }

        // TODO: numeroCaravana, una vez obtenido se tiene que buscar en la lista de caravanas perteneciente a una firma para que ya complete los campos disponibles
        //

        Spinner sel_firma = (Spinner) findViewById(R.id.spnrFirmas);

        //firma = Integer.parseInt(sel_firma.toString());

        // TODO: Firma va a ser un objeto que contiene un atributo numero, eso es lo que debemos pasar al constructor de Vacuno
        String selected = sel_firma.getSelectedItem().toString();
        if (selected.equals("Facundo")) {
            firma = 1;
        }else{
            firma = 2;
        }

        // TODO: agregar try catch para todos los metodos que traen textos de pantalla
        CheckBox sel_pren = (CheckBox) findViewById(R.id.chkbxPrenada);
        if (sel_pren.isSelected()) {
            prenada = true;
        }

        EditText _peso = (EditText) findViewById(R.id.txtPeso);
        peso = Double.parseDouble(_peso.getText().toString());

        Spinner _edad = (Spinner) findViewById(R.id.spnrEdad);
        edad = Integer.parseInt(_edad.getSelectedItem().toString());

        EditText _notas = (EditText) findViewById(R.id.txtNotas);
        notas = _notas.getText().toString();

        Vacuno nuevo_vacuno = new Vacuno(numeroCaravana, firma, prenada, peso, edad, notas);
        GestoraVacunos.getInstance().agregarVacunoALista(nuevo_vacuno);

        // ExpandableListView - get the element
        ExpandableListView _listaVacIngresados = (ExpandableListView) findViewById(R.id.lstVacunosIngresados);

        // preparing list data - listAdapter va a manejar los elementos de la lista
        prepareListData();

        // setting list adapter
        ExpandableListAdapterGR listAdapter = new ExpandableListAdapterGR(this, listDataHeader, listDataChild);
        _listaVacIngresados.setAdapter(listAdapter);

    }

    /*
    * Preparing the list data
    */
    private void prepareListData(){

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Los Candados");
        listDataHeader.add("Facundo");
        listDataHeader.add("El Cerno");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }

}
