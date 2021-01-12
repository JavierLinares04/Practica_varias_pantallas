package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Precio_nintendo extends AppCompatActivity {

    TextView modificar;
    String n_nombre;
    int n_numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precio_nintendo);

        Bundle informacion = getIntent().getExtras();
        n_nombre = informacion.getString("c_nombre");
        n_numero = informacion.getInt("c_unid");
        int total = ((n_nombre.length()*10)+300)*n_numero;


        modificar = (TextView)findViewById(R.id.tv_modificar2);
        modificar.setText("El precio para "+ n_numero + " dispositivo con el nombre "+ n_nombre +" es: "+ total);

    }

    public void funcion_cerrar(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}