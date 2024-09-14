package com.example.evaluacion13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo, txtFooter;
    private Button btnCalculadra, btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtFooter = findViewById(R.id.txtFooter);

        btnCalculadra = findViewById(R.id.btnCalculadra);
        btnRandom = findViewById(R.id.btnRandom);

        txtTitulo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        txtFooter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        btnCalculadra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calculadora.class);
                startActivity(intent);
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, random.class);
                startActivity(intent);
            }
        });
    }
}