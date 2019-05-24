package com.example.labs;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class lab4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 10, 34, 43, 78, 89, 54};
        shuffleArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
static void shuffleArray(int[] ar){
    Random rnd = ThreadLocalRandom.current();
    for(int i = ar.length - 1; i> 0; i--)
    {
        int index = rnd.nextInt(i + 1);
        int a = ar[index];
        ar[index] = ar[i];
        ar[i] = a;
    }
        }
    }
