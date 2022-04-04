package br.com.sousys.devassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMotorista extends AppCompatActivity {

    ConstraintLayout coleta_view;
    ConstraintLayout view_entrega_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_motorista);

        getSupportActionBar().hide();

        iniciarComponentes();

        coleta_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainMotorista.this, DetalhamentoColeta.class);
                startActivity(intent);
            }
        });

        view_entrega_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainMotorista.this, DetalhamentoEntrega.class);
                startActivity(intent);
            }
        });
    }

    public void iniciarComponentes(){
        view_entrega_1 = findViewById(R.id.view_entrega_1);
        coleta_view = findViewById(R.id.coleta_view);
    }
}