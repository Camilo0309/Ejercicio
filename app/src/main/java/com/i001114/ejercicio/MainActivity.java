package com.i001114.ejercicio;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.i001114.ejercicio.Views.MapsActivity;
import com.i001114.ejercicio.Views.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    EditText editTextName, editTextPass;
    TextView textViewRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        editTextName = (EditText) findViewById(R.id.login_name);
        editTextPass = (EditText) findViewById(R.id.login_pass);
        textViewRegister = (TextView) findViewById(R.id.btn_register);

    }
    public void OPenRegisterWindow(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void Login(View view){
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }



}
