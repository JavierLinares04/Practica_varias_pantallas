package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Modificar extends AppCompatActivity {

    TextView tv_cantidad;
    int n_cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);


        Bundle cantidad = getIntent().getExtras();
        n_cantidad = cantidad.getInt("c_unid");

        tv_cantidad = (TextView) findViewById(R.id.Tv_unid_modif);
        tv_cantidad.setText(""+n_cantidad);

    }

    public void funcion_sumar(View view) {
        n_cantidad++;

        tv_cantidad = (TextView) findViewById(R.id.Tv_unid_modif);
        tv_cantidad.setText(""+n_cantidad);
    }

    public void funcion_resta(View view) {
        n_cantidad--;

        tv_cantidad = (TextView) findViewById(R.id.Tv_unid_modif);
        tv_cantidad.setText(""+n_cantidad);
    }

    public void funcion_guardar(View view) {
        Intent devolver_datos = new Intent(this, Precios_personalizados.class);
        devolver_datos.putExtra("c_unid_1", n_cantidad);
        setResult(RESULT_OK, devolver_datos);
        finish();
    }

    public void funcion_no_guardar(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}