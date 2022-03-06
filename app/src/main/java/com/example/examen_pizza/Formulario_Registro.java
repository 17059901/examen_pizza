package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario_Registro extends AppCompatActivity {
    EditText user, pass;
    Button btnregistrate;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);

        user = (EditText) findViewById(R.id.ediuser);
        pass = (EditText) findViewById(R.id.edipass);
        btnregistrate = (Button) findViewById(R.id.btnregistrate);
        btnregresar = (Button) findViewById(R.id.btnback);



        btnregistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Registro Completado", Toast.LENGTH_LONG).show();
            }
        });


        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
