package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagenDetalle = (ImageView) findViewById(R.id.imagenDetalle);
        getSupportActionBar().setTitle(getString(R.string.fastfood));


    }

    //Metodo para el boton sandwich
public void sandwich(View view) {
    Intent sandwich = new Intent(this,sandwiches.class);
    startActivity(sandwich);
}


//Metodo para el "boton sobre Nosotros"

    public void sobreNosotros(View view) {
        Intent nosotros = new Intent(this,sobreNosotros.class);
        startActivity(nosotros);
    }
}
