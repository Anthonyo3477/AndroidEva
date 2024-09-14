package com.example.evaluacion13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class random extends AppCompatActivity {

    private EditText txtPrimerNumero, txtSegundoNumero;
    private Button btnRandom, btnVolverR;
    private TextView tvResultadoR;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numeros_aleatorio);

        txtPrimerNumero = findViewById(R.id.txtPrimerNumero);
        txtSegundoNumero = findViewById(R.id.txtSegundoNumero);

        btnRandom = findViewById(R.id.btnRandom);
        btnVolverR = findViewById(R.id.btnVolverR);

        tvResultadoR = findViewById(R.id.tvResultadoR);

        txtPrimerNumero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        txtSegundoNumero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { numeroAleatorio(); }
        });

        btnVolverR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { finish(); }
        });
    }

    private void numeroAleatorio (){
        if(!txtPrimerNumero.getText().toString().isEmpty() && !txtSegundoNumero.getText().toString().isEmpty()) {

            int primerN = Integer.parseInt(txtPrimerNumero.getText().toString());
            int segundoN = Integer.parseInt(txtSegundoNumero.getText().toString());

            if( segundoN > primerN ){
                Random random = new Random();
                int numeroRandom = random.nextInt((segundoN - primerN ) + 1) + primerN;
                tvResultadoR.setText("Su numero random es: " + numeroRandom);

            }else{
                Toast.makeText(random.this, "El segundo número debe ser mayor que el primero", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(random.this, "Por favor, ingresa ambos números", Toast.LENGTH_SHORT).show();
        }
    }
}
