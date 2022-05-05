package com.example.exressourcetdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);

        // Resuperer la valeur de chaine2
        String ch = getString(R.string.chaine2);

        // Recuperer tableau des chaines de caracteres.
        String[] t = getResources().getStringArray(R.array.filiere);


        // Recuperer une valeur.
        int a = getResources().getInteger(R.integer.val1);

        // Recuperer un tab des entiers
        int[] b = getResources().getIntArray(R.array.taux);

        // Recuperer couleur
        btn.setBackgroundColor(getResources().getColor(R.color.c2));

        // Recuperer dimension
        btn.setTextSize(getResources().getDimension(R.dimen.d2));

    }
}