package com.javierlinares.act_videojuego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Fabricante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabricante);
    }

    public void funcion_microsoft(View view) {
        Intent microsoft = new Intent(this, Microsoft.class);
        startActivity(microsoft);
        Log.i("Activity", "Microsoft");
    }


    public void funcion_sony(View view) {
        Intent sony = new Intent(this, Sony.class);
        startActivity(sony);
        Log.i("Activity", "Sony");
    }

    public void funcion_nintendo(View view) {
        Intent nintendo = new Intent(this, Nintendo.class);
        startActivity(nintendo);
        Log.i("Activity", "Nintendo");
    }

    public void funcion_volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}