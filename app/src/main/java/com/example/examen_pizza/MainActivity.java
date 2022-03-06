package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button register;
    ImageView logo;
    EditText user,pass;
    Button btniniciar,salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register=(Button) findViewById(R.id.register);
        logo=(ImageView) findViewById(R.id.logo);
        user=(EditText) findViewById(R.id.ediuser);
        pass=(EditText) findViewById(R.id.edipass);
        btniniciar=(Button) findViewById(R.id.btninicio);
        salir=(Button) findViewById(R.id.btnsalir);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Formulario_Registro.class);
                startActivity(intent);

            }
        });


        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Formulario_Menu.class);
                intent.putExtra("user",user.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                startActivity(intent);

            }
        });


    }

}