package com.example.labs;
import java.util.Random;
import java.lang.Math;
public class lab1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(500);
       double a = 0.75;
       double b = 1.1;

       double c = 0.4;

       double res = (Math.sin((a * x) - 1) / (Math.pow(b, 3) * Math.sqrt((x * x) - c))) + Math.tan(b / (a * ((x * x) + c)));

        System.out.println("Calculation result is = " + res );




    }


}
