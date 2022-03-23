package com.ani.anime.aniplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PerfisTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfis_tela);

        getSupportActionBar().hide();
    }
}