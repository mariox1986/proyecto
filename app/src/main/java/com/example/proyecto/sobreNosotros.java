package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class sobreNosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nosotros);

        //boton atras
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //texto navbar
        getSupportActionBar().setTitle(getString(R.string.fastfood));
    }


    //botonAtras
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }


}
