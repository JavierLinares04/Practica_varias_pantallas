package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
    }

    public void funcion_cerrar(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}