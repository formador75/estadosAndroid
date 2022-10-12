package com.miempresa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Log.d("cicloVida","Estamos2 en estado onCreate");
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