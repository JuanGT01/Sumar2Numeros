package com.example.sumar2numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1;
    EditText numero2;
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SUMAR","Mi actividad se ha parado");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("SUMAR","Mi actividad se ha resumido");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SUMAR","Mi actividad se ha destruido");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRestar = findViewById(R.id.botonRestar);
        Button botonMultiplicar = findViewById(R.id.botonMultiplicar);
        Button botonDividir = findViewById(R.id.botonDividir);
        numero1 = findViewById(R.id.editTextNumber);
        numero2 = findViewById(R.id.editTextNumber2);
        TextView resultado = findViewById(R.id.textView);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int suma = n1 + n2;
                resultado.setText("La suma de " + n1 + " + " + n2 + " = " + suma);
            }
        });
        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int resta = n1 - n2;
                resultado.setText("La resta de " + n1 + " - " + n2 + " = " + resta);
            }
        });
        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int multi = n1 * n2;
                resultado.setText("La multiplicacion de " + n1 + " * " + n2 + " = " + multi);
            }
        });
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int divi = n1 / n2;
                resultado.setText("La division de " + n1 + " / " + n2 + " = " + divi);
            }
        });

    }
}