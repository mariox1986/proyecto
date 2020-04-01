package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class detalle extends AppCompatActivity {

    public TextView tvNombre, tvDescripcion,tvPrecio;
    public ImageView imagenDetalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        tvPrecio = (TextView) findViewById(R.id.tvPrecio);
        //para ver la imagen en detalle, dependiendo el tipo
        ImageView imagen = (ImageView) findViewById(R.id.imagenDetalle);


//recibimos el arrayList desde la clase sandwiches
        ArrayList<Sandwich> lista = (ArrayList<Sandwich> ) getIntent().getSerializableExtra("sandwich");
        Bundle extras = getIntent().getExtras();
        String tipo = extras.getString("tipo");
//boton atras
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);






        //imagenes en array

        final int [] imagenesSandwich =
                {
                        R.drawable.chacarero,
                        R.drawable.churrasco,
                        R.drawable.fricandela,
                        R.drawable.lomito,
                        R.drawable.mechada,

                };




//imprime dependiendo el tipo
if (tipo.equals("chacarero")) {
    getSupportActionBar().setTitle("Detalle Sandwich Chacarero");
    imagen.setImageResource(imagenesSandwich[0]);
    tvNombre.setText(lista.get(0).getNombre());
    tvDescripcion.setText(lista.get(0).getDescripcion());
    tvPrecio.setText(lista.get(0).getPrecio());
}

if (tipo.equals("churrasco")) {
    getSupportActionBar().setTitle("Detalle Sandwich Churrasco");
    imagen.setImageResource(imagenesSandwich[1]);
    tvNombre.setText(lista.get(1).getNombre());
    tvDescripcion.setText(lista.get(1).getDescripcion());
    tvPrecio.setText(lista.get(1).getPrecio());
}

if (tipo.equals("fricandela")){
    getSupportActionBar().setTitle("Detalle Sandwich Fricandela");
    imagen.setImageResource(imagenesSandwich[2]);
    tvNombre.setText(lista.get(2).getNombre());
    tvDescripcion.setText(lista.get(2).getDescripcion());
    tvPrecio.setText(lista.get(2).getPrecio());
}

if (tipo.equals("lomito")){
    getSupportActionBar().setTitle("Detalle Sandwich Lomito");
    imagen.setImageResource(imagenesSandwich[3]);
    tvNombre.setText(lista.get(3).getNombre());
    tvDescripcion.setText(lista.get(3).getDescripcion());
    tvPrecio.setText(lista.get(3).getPrecio());
}

if (tipo.equals("mechada")){
    getSupportActionBar().setTitle("Detalle Sandwich Mechada");
    imagen.setImageResource(imagenesSandwich[4]);
    tvNombre.setText(lista.get(4).getNombre());
    tvDescripcion.setText(lista.get(4).getDescripcion());
    tvPrecio.setText(lista.get(4).getPrecio());
}

    }

    //botonAtras
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }


}
