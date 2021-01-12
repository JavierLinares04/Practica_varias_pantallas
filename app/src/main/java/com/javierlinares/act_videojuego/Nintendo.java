package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nintendo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo);
    }

    public void funcion_cerrar(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void funcion_web(View view) {
        Intent web = new Intent(this, Web.class);
        startActivity(web);
    }
}