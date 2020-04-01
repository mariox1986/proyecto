package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;
import java.util.Objects;


public class sandwiches extends AppCompatActivity {

    //arrayList de objetos Sandwich
    ArrayList<Sandwich> pan = new ArrayList<>();

    String tipo;



    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);



        //Creacion de los objetos Sandwich

        pan.add(new Sandwich("0", "SANDWICH CHACARERO", "CONTIENE CARNE DE VACUNO, TOMATE, POROTOS VERDES Y AJÍ VERDE.", "PRECIO: $3800"));
        pan.add(new Sandwich("1", "SANDWICH CHURRASCO", "CONTIENE CARNE CORTADA EN LAMINAS, TOMATE Y PALTA.", "PRECIO: $3700"));
        pan.add(new Sandwich("2", "SANDWICH FRICANDELA", "CONTIENE CARNE DE VACUNO ALIÑADA CON CEBOLLA Y HIERBAS.", "PRECIO: 3600"));
        pan.add(new Sandwich("3", "SANDWICH LOMITO", "CONTIENE LOMOS DE CERDO COCINADO A LA OLLA MÁS PALTA, TOMATE Y MAYO", "PRECIO: 3500"));
        pan.add(new Sandwich("4", "SANDWICH MECHADA", "CONTIENE CARNE A LA OLLA, COCINADA POR HORAS MAS PALTA, TOMATE Y MAYO", "PRECIO: 3400"));


    getSupportActionBar().setTitle("Sandwiches");


        //boton atras
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);



    }


    public void chacarero(View view) {
        Intent intent = new Intent(this, detalle.class);
        intent.putExtra("sandwich", pan);
        tipo = "chacarero";
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }


    public void churrasco(View view) {
        Intent intent = new Intent(this, detalle.class);
        intent.putExtra("sandwich", pan);
        tipo = "churrasco";
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }

    public void fricandela(View view) {
        Intent intent = new Intent(this, detalle.class);
        intent.putExtra("sandwich", pan);
        tipo = "fricandela";
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }

    public void lomito(View view) {
        Intent intent = new Intent(this, detalle.class);
        intent.putExtra("sandwich", pan);
        tipo = "lomito";
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }

    public void mechada(View view) {
        Intent intent = new Intent(this, detalle.class);
        intent.putExtra("sandwich", pan);
        tipo = "mechada";
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }


//botonAtras
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }





}
