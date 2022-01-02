package com.example.tplesgoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.*;
import java.lang.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("combien de fille");
        Integer fille = scan.nextInt();
        System.out.println("combien de garcon");
        Integer garcon = scan.nextInt();
        System.out.println("voter some d'argen: ");
        Integer some = scan.nextInt();
        Integer some2=0 , some3 = 0;
        if (fille == 1) {
            Integer some1 = some / 2;
            System.out.println("son heritage est " + some1);
        } else {
            if (fille > 1 && garcon == 0) {
                some2 = (some * 2) / 3;
                System.out.println("chaque fille herite \n" + some2);
            }
            else
            if (fille > 1 && garcon > 0)
                some2 = (some * 2) / 3;
            System.out.println("chaque fille herite \n" + some2);
            some3= ((some * 2) / 3)*2;
            System.out.println("chaque garcon herite \n" + some3);
        }
    }}

