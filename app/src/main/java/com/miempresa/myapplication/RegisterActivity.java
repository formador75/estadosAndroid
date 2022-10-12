package com.miempresa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView tvUsuario, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tvUsuario = findViewById(R.id.textView);
        tvPassword = findViewById(R.id.textView2);
        Log.d("cicloVida","Estamos2 en estado onCreate");
        Bundle datos = getIntent().getExtras();
        String usuario = datos.getString("usuario");
        String password = datos.getString("password");
        tvUsuario.setText(usuario);
        tvPassword.setText(password);
    }

    public void irAtras(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

        Log.d("cicloVida","Estamos2 en probando boton atras");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cicloVida","Estamos2 en estado onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cicloVida","Estamos2 en estado onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cicloVida","Estamos2 en estado onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("cicloVida","Estamos2 en estado onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cicloVida","Estamos2 en estado onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cicloVida","Estamos2 en estado onRestart");
    }
}