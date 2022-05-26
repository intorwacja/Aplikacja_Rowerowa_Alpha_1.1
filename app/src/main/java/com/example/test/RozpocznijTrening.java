package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class RozpocznijTrening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozpocznij_trening);

        String[] aktywnosci = new String[]{
                "Bieganie", "Rower", "Rolki"            //Aktywnosci
        };

        Spinner aktywnosc = (Spinner) findViewById(R.id.spinner);       //Spinner Aktywnosci
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, aktywnosci);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //Adapter do spinnera
        aktywnosc.setAdapter(adapter);

        Button rozpocznij = (Button) findViewById(R.id.button7);
        rozpocznij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}