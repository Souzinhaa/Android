package br.com.sousys.devassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainExpedidor extends AppCompatActivity {

    View view_logout;
    Button btn_cadastrar_pedido;
    View container_user;
    View container_car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_expedidor);

        iniciarComponentes();

        view_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(MainExpedidor.this, LoginForm.class);
                startActivity(intent);
                finish();
            }
        });

        btn_cadastrar_pedido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainExpedidor.this, NovaColeta.class);
                startActivity(intent);
            }
        });

        container_user.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainExpedidor.this, NovoUsuario.class);
                startActivity(intent);
            }
        });

        container_car.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainExpedidor.this, NovoCarro.class);
                startActivity(intent);
            }
        });

    }

    public void iniciarComponentes(){
        btn_cadastrar_pedido = findViewById(R.id.btn_cadastrar_pedido);
        container_user = findViewById(R.id.container_user);
        container_car = findViewById(R.id.container_car);
        view_logout = findViewById(R.id.view_logout);
    }
}