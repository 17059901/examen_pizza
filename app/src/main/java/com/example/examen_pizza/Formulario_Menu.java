package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Formulario_Menu extends AppCompatActivity {
    TextView mensaje;
    Button btnmenu;
    Button btnsalir;
    String usuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_menu);
        mensaje = (TextView) findViewById(R.id.mensaje);
        btnmenu = (Button) findViewById(R.id.ir_menu);
        btnsalir = (Button) findViewById(R.id.btnsalir);
        usuario = "";
        password = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.get("user") != null && extras.get("pass") != null) {
                usuario = extras.get("user").toString();
                password = extras.get("pass").toString();
            }else
                Toast.makeText(getApplicationContext(), "No existe user y pass", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(getApplicationContext(), "No existen extras", Toast.LENGTH_SHORT).show();
        mensaje.setText("Bienvenido "+usuario+ "tu pass es: "+password);


        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Formulario_Menu.this,MenuPrincipal.class);
                startActivity(intent);

            }
        });



        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Formulario_Menu.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}