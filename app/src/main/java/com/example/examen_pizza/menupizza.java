package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class menupizza extends AppCompatActivity {
    TextView pizza, txt1, txt2, txt3;
    CheckBox pastor, hawaiano,salami;
    ImageView pizzapastor, pizzahawaiana, pizzasalami;
    Button fnpedido, bebidas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupizza);

        pizza=(TextView) findViewById(R.id.pizza);
        pastor=(CheckBox) findViewById(R.id.check1);
        hawaiano=(CheckBox) findViewById(R.id.check2);
        salami=(CheckBox) findViewById(R.id.check3);
        pizzapastor=(ImageView) findViewById(R.id.pizzapastor);
        pizzahawaiana=(ImageView) findViewById(R.id.pizzahawaiana);
        pizzasalami=(ImageView) findViewById(R.id.pizzasalami);
        fnpedido=(Button) findViewById(R.id.fnpedido);
        bebidas=(Button) findViewById(R.id.btnbebidas);

        fnpedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menupizza.this,Finalizar_Pedido.class);
                startActivity(intent);

            }
        });


        bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menupizza.this,menubebidas.class);
                startActivity(intent);

            }
        });

    }
}