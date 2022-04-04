package br.com.sousys.devassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginForm extends AppCompatActivity {

    EditText edit_login;
    EditText edit_senha;
    AppCompatButton btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        getSupportActionBar().hide();

        iniciarComponentes();

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginForm.this, MainMotorista.class);
                startActivity(intent);
            }
        });

    }

    public void iniciarComponentes(){
        btn_login = findViewById(R.id.btn_login);
        edit_login = findViewById(R.id.edit_login);
        edit_senha = findViewById(R.id.edit_senha);
    }
}