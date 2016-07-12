package com.example.claudia.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sedes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);
    }
    public void inf_sede_central(View view){
        Intent intent=new Intent(this,ActivitySede_central.class);
        startActivity(intent);
    }
}
