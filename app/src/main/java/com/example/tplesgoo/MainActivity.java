/*
        Copyright (C) 2022  boukhalfa bochra and seif achi
        This program is free software; you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation; either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program; if not, see <https://www.gnu.org/licenses/>

*/

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
           resultat.setText("la fille herite " + some1);

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

