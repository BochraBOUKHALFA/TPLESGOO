package com.example.tplesgoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.*;
import java.lang.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button calculer ;
    EditText somme, filles, garcons;
    TextView resultat, resultat2 ;
    double some2, some3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        somme = findViewById(R.id.s);
       garcons = findViewById(R.id.nbg);
        filles = findViewById(R.id.nbf);
        resultat = findViewById(R.id.result);
        resultat2 = findViewById(R.id.result2);
       calculer = findViewById(R.id.button);

       calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heritage();
            }
        });
    }

    public void heritage() {
        Integer fille ,garcon ;
        float some ;
        some =  Float.parseFloat(somme.getText().toString());
        fille = Integer.parseInt(filles.getText().toString());
        garcon = Integer.parseInt(garcons.getText().toString());
       float some2=0 , some3 = 0;
        if (fille == 1) {
            double some1 = some / 2;
           resultat.setText("son heritage est " + some1);

        } else {
            if (fille > 1 && garcon == 0) {
                some2 = (some * 2) / 3;
                resultat.setText("chaque fille herite \n" + some2);
            }
            else
            if (fille > 1 && garcon > 0){
                some2 = (some * 2) / 3;
            resultat.setText("chaque fille herite \n" + some2);
            some3= ((some * 2) / 3)*2;
            resultat2.setText("chaque garcon herite \n" + some3);
        }
            else
                resultat.setText("ERROR");
        }
    }}

