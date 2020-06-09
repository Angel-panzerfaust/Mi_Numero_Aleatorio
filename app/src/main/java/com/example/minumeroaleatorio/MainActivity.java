package com.example.minumeroaleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtNumero; //variable que referencia a el text view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculamos los compnenetes o view con nuestra variables
        txtNumero = (TextView) findViewById(R.id.txtNumeroAleatorio);


    }

    public void obtenerNumeroAleatorio(View view)
    {
        //limite de numero maximo posible
        int n = 10;
        //creacion de un objeto random
        Random r= new Random();
        //usa random para generar un entero aleatorio
        int numeroAleatorio= r.nextInt(n+1);
        //asignas resultado a el txt donde va
        txtNumero.setText(Integer.toString(numeroAleatorio));

    }
}
