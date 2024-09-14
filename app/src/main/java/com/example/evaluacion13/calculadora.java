package com.example.evaluacion13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora extends AppCompatActivity {
    //Estas son las variables que utilize
    private EditText txtPeso, txtAltura;
    private Button btnCalcular, btnVolver;
    private TextView tvResultadoC;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_imc);

        //Aqui Inicialize las varialbles
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtALtura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnVolver = findViewById(R.id.btnVolver);
        tvResultadoC = findViewById(R.id.tvResultadoC);


        txtPeso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        txtAltura.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { CalcularIMC(); }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { finish(); }
        });

        tvResultadoC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  }
        });

    }
        //Este es el metodo para calcular el IMC que luego lo pase al boton de arriba
        private void CalcularIMC() {
            //Variables
            String pesoSrt = txtPeso.getText().toString();
            String alturaSrt = txtAltura.getText().toString();

            if(!pesoSrt.isEmpty() && !alturaSrt.isEmpty()){
                //Variables
                double peso = Double.parseDouble(pesoSrt);
                double altura = Double.parseDouble(alturaSrt);
                double imc = peso / (altura * altura);

                String mensaje = Mensaje(imc);
                tvResultadoC.setText("Su IMC es: " +String.format("%.2f", imc)+" - "+ mensaje);
            }else{
                tvResultadoC.setText("Ingresa Tu Peso y Altura");

            }
        }

        //Este metodo pone un mensaje te dice si estas con bajo peso, peso normal, sobre peso,etc. que luego lo junto con el metodo de arriba
        private String Mensaje(Double imc) {

        if(imc < 65) {
            return "Bajo Peso";
        } else if (imc >= 65 && imc < 70) {
            return "Peso Normal";
        } else if (imc >= 70 && imc < 80) {
            return "Sobre Peso";
        }else {
            return "Obesidad";
        }
    }
}
