package br.com.sousys.devassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainMotorista extends AppCompatActivity {
    View view_logout;
    ConstraintLayout coleta_view;
    ConstraintLayout view_entrega_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_motorista);

        iniciarComponentes();

        view_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(MainMotorista.this, LoginForm.class);
                startActivity(intent);
                finish();
            }
        });

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
        view_logout = findViewById(R.id.view_logout);
    }
}