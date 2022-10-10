package com.miempresa.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.d("cicloVida","Estamos en estado onCreate");

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
            Log.d("pruebaMenu", "Probo menu cambio contraseña");
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