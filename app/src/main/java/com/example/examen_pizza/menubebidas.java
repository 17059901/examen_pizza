package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class menubebidas extends AppCompatActivity {
    TextView bebidas, text1, text2, text3;
    CheckBox coca, fanta, sprite;
    ImageView imgcoca, imgfanta, imgsprite;
    Button fnpedido, pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubebidas);

        bebidas=(TextView) findViewById(R.id.bebidas);
        coca=(CheckBox) findViewById(R.id.check_1);
        fanta=(CheckBox) findViewById(R.id.check_2);
        sprite=(CheckBox) findViewById(R.id.check_3);
        imgcoca=(ImageView) findViewById(R.id.coca);
        imgfanta=(ImageView) findViewById(R.id.fanta);
        imgsprite=(ImageView) findViewById(R.id.sprite);
        fnpedido=(Button) findViewById(R.id.fnpedido);
        pizzas=(Button) findViewById(R.id.btnpizzas);

        fnpedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menubebidas.this,Finalizar_Pedido.class);
                startActivity(intent);

            }
        });


        pizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menubebidas.this,menupizza.class);
                startActivity(intent);

            }
        });

    }
}