package com.example.examen_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Finalizar_Pedido extends AppCompatActivity {
    TextView msjfinalizar, txttotal;
    CheckBox pastor, hawaiano, salami, coca,fanta, sprite;
    Button btnenviar, btncancel;
    Button btncalcular;
    TextView cant1, cant2, cant3;
    TextView cant4, cant5, cant6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_pedido);

        msjfinalizar = (TextView) findViewById(R.id.msjfinalizar);
        cant1=(TextView) findViewById(R.id.cant1);
        cant2=(TextView) findViewById(R.id.cant2);
        cant3=(TextView) findViewById(R.id.cant3);
        cant4=(TextView) findViewById(R.id.cant4);
        cant5=(TextView) findViewById(R.id.cant5);
        cant6=(TextView) findViewById(R.id.cant6);
        txttotal = (TextView) findViewById(R.id.txttotal);
        btnenviar = (Button) findViewById(R.id.btnenviar);
        btncancel = (Button) findViewById(R.id.btncalcel);
        pastor = (CheckBox) findViewById(R.id.check1);
        hawaiano = (CheckBox) findViewById(R.id.check2);
        salami = (CheckBox) findViewById(R.id.check3);
        coca = (CheckBox) findViewById(R.id.check_1);
        fanta = (CheckBox) findViewById(R.id.check_2);
        sprite = (CheckBox) findViewById(R.id.check_3);
        btncalcular = (Button) findViewById(R.id.btncalcular);


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Gracias por utilizar la app VitoLugini, su pedido fue recicido,en breve se enviara", Toast.LENGTH_LONG).show();
            }
        });


        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Finalizar_Pedido.this, MenuPrincipal.class);
                startActivity(intent);
            }
        });



    }


    public void calcular(View view) {

        double total=0.0;
        if(pastor.isChecked())
            total = total + 140;

        if(hawaiano.isChecked())
            total = total + 100;

        if(salami.isChecked())
            total =total + 80;

        if(coca.isChecked())
            total = total + 20;

        if(fanta.isChecked())
            total = total + 20;

        if(sprite.isChecked())
            total = total + 20;

        txttotal.setText("Total: " + total);
    }

}



