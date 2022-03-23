package com.ani.anime.aniplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();

    }

    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.mover_esquerda, R.anim.mover_direita);
    }
}