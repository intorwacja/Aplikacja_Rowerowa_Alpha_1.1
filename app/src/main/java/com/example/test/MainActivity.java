package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rozpocznijTrening = (Button) findViewById(R.id.button);         //Przycisk Rozpocznij Trening OnClick
        rozpocznijTrening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRozpocznijTrening();
            }
        });

        Button historiaTreningow = (Button) findViewById(R.id.button2);         //Przycisk Historia Treningow OnClick
        historiaTreningow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistoriaTreningow();
            }
        });

        Button ustawienia = (Button) findViewById(R.id.button3);         //Przycisk Ustawienia OnClick
        ustawienia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUstawienia();
            }
        });

        Button statystyki = (Button) findViewById(R.id.button4);         //Przycisk Statystyki OnClick
        statystyki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStatystyki();
            }
        });

        Button profil = (Button) findViewById(R.id.button5);         //Przycisk Profil OnClick
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfil();
            }
        });

        Button wczytajDane = (Button) findViewById(R.id.button6);
        wczytajDane.setOnClickListener(new View.OnClickListener() {         //Przycisk wczytaj dane
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void openRozpocznijTrening(){
        Intent intent = new Intent(this, RozpocznijTrening.class);
        startActivity(intent);
    }

    public void openHistoriaTreningow(){
        Intent intent = new Intent(this, HistoriaTreningow.class);
        startActivity(intent);
    }

    public void openUstawienia(){
        Intent intent = new Intent(this, Ustawienia.class);
        startActivity(intent);
    }

    public void openStatystyki(){
        Intent intent = new Intent(this, Statystyki.class);
        startActivity(intent);
    }

    public void openProfil(){
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }




}