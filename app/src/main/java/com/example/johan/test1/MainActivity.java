package com.example.johan.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //l
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        b= (Button) findViewById(R.id.boton1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.setText("prueba");
            }
        });
    }


}
