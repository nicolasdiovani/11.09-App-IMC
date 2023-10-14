package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText altura;
    private EditText peso;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = findViewById(R.id.altura);
        peso = findViewById(R.id.altura);
        result = findViewById(R.id.result);
    }
    public void imc(View view){
        int valor1= Integer.parseInt(altura.getText().toString());
        int valor2= Integer.parseInt(peso.getText().toString());
        result.setText(String.valueOf((valor2*valor2)+valor1));
    }
}