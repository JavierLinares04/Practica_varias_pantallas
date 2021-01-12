package com.javierlinares.act_videojuego;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Precios_personalizados extends AppCompatActivity {

    EditText edt_nombre, edt_unid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precios_personalizados);
        edt_nombre = (EditText)findViewById(R.id.EDT_nombre);
        edt_unid = (EditText) findViewById(R.id.EDT_unidades);
    }

    public void funcion_modificar(View view) {

        int unidad = Integer.parseInt(edt_unid.getText().toString());

        Intent modificar = new Intent(this, Modificar.class);
        modificar.putExtra("c_unid", unidad);
        startActivity(modificar);



    }

    public void funcion_play5(View view) {
        String nombre = edt_nombre.getText().toString();
        int unidad = Integer.parseInt(edt_unid.getText().toString());

        Intent play = new Intent(this, Precio_Play5.class);
        play.putExtra("c_nombre", nombre);
        play.putExtra("c_unid", unidad);
        startActivity(play);

    }

    public void funcion_nintendo(View view) {
        String nombre = edt_nombre.getText().toString();
        int unidad = Integer.parseInt(edt_unid.getText().toString());

        Intent nintendo = new Intent(this, Precio_nintendo.class);
        nintendo.putExtra("c_nombre", nombre);
        nintendo.putExtra("c_unid", unidad);
        startActivity(nintendo);
    }


    public void funcion_volver(View view) {
        finish();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            int n_numero_modif = data.getIntExtra("c_unid_1", 0);
            Toast.makeText(this, "El numero devuelto es: "+ n_numero_modif, Toast.LENGTH_SHORT).show();

            edt_unid.setText(n_numero_modif);
        }

    }
}