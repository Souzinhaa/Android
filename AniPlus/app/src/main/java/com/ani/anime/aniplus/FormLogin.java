package com.ani.anime.aniplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    Button button_login;
    TextView text_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        IniciarComponentes();

        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormLogin.this, PerfisTela.class);
                startActivity(intent);
            }
        });
        text_cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                //ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.mover_direita, R.anim.mover_esquerda);
                //ActivityCompat.startActivity(FormLogin.this, intent, activityOptionsCompat.toBundle());
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        button_login = findViewById(R.id.button_login);
        text_cadastrar = findViewById(R.id.text_cadastrar);
    }
}