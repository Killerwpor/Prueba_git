package com.example.johan.test1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity {

    ImageButton botonCartelera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        botonCartelera= (ImageButton) findViewById(R.id.imagenCartelera);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botonCartelera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //direccionar a cartelera
            }
        });

    }

}
