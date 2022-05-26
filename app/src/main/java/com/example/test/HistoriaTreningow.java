package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class HistoriaTreningow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_treningow);

        ArrayList<String> historiaTreningowArrayList = new ArrayList<>();

        Spinner historiaTreningow = (Spinner) findViewById(R.id.spinner2);       //Spinner Aktywnosci
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, historiaTreningowArrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //Adapter do spinnera
        historiaTreningow.setAdapter(adapter);

        Button wyswietl = (Button) findViewById(R.id.button12);
        wyswietl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}