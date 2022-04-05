package br.com.sousys.devassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NovaColeta extends AppCompatActivity {

    AppCompatButton btn_deletar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_coleta);

        iniciarComponentes();

        btn_deletar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(NovaColeta.this, MainExpedidor.class);
                startActivity(intent);
            }
        });
    }

    public void iniciarComponentes(){
        btn_deletar = findViewById(R.id.btn_deletar);
    }
}