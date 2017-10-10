package com.gestionrural.meirelles.gestionrural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegarConfiguracionInicial(View view){
        Intent intent = new Intent(MainActivity.this, Configuracion.class);
        startActivity(intent);
    }

    public void navegarAcceder(View view){
        Intent intent = new Intent(MainActivity.this, gestion.class);
        startActivity(intent);
    }

}
