package com.gestionrural.meirelles.gestionrural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        Intent intent = getIntent();
    }

    public void navegarGestionHembras(View view){
        Intent intent = new Intent(this, gestion_vacunos.class);
        startActivity(intent);
    }

    public void navegarGestionMachos(View view){
        Intent intent = new Intent(this, gestion_vacunos.class);
        startActivity(intent);
    }

    public void navegarGestionGeneral(View view){
        Intent intent = new Intent(this, gestion_vacunos.class);
        startActivity(intent);
    }
}
