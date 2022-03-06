package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {
    TextView txtmsj;
    ImageButton pizzas, bebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        txtmsj=(TextView) findViewById(R.id.txtmsj);
        pizzas=(ImageButton) findViewById(R.id.menu);
        bebidas=(ImageButton) findViewById(R.id.bebida);

        pizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuPrincipal.this,menupizza.class);
                startActivity(intent);

            }
        });


        bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuPrincipal.this,menubebidas.class);
                startActivity(intent);

            }
        });


    }

}