package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void funcion_fabricante(View view) {
        Intent fabricante = new Intent(this, Fabricante.class);
        startActivity(fabricante);
        Log.i("Activity", "Fabricante");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void funcion_compras(View view) {
        Intent compras = new Intent(this, Precios_personalizados.class);
        startActivity(compras);
        Log.i("Activity", "Compras");
    }
}