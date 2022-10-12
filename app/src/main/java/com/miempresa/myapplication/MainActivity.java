package com.miempresa.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botonIngreso;
    private EditText textoEditar, passWord;
    private TextView tituloApp;
    private String usuario, contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("cicloVida","Estamos en estado onCreate");
        botonIngreso = findViewById(R.id.loginBoton);
        textoEditar = findViewById(R.id.editTextTextEmailAddress);
        tituloApp = findViewById(R.id.tituloApp);
        passWord = findViewById(R.id.editTextTextPassword);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               usuario = textoEditar.getText().toString();
               contrasena = passWord.getText().toString();
                Log.d("cicloVida",usuario);
                Log.d("cicloVida",contrasena);
               if (usuario.equals("jorge")){
                   irRegistrarse();

                   Log.d("cicloVida","el usuario ingreo con exito");

               }else{

                   Log.d("cicloVida","el usuario o la contraseña esta equivocada");
               }


            }
        });

    }

    public void probarBoton(){
        Log.d("cicloVida","Estamos probando el boton");
    }

    public void irRegistrarse(){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);


        Log.d("cicloVida","Estamos probando el boton 2");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.cambioContrasena){
            Log.d("cicloVida", "Probo menu cambio contraseña");
        }
        if(id==R.id.perfil){
            Log.d("cicloVida", "Probo menu perfil");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cicloVida","Estamos en estado onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cicloVida","Estamos en estado onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cicloVida","Estamos en estado onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("cicloVida","Estamos en estado onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cicloVida","Estamos en estado onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cicloVida","Estamos en estado onRestart");
    }
}