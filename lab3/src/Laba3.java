package laba3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Laba3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Array of incorrect numbers"); 
        int d[] = new int[5];
        int b[] = new int[5];
        boolean p = true;
        for (int i = 0; i < b.length; ++i) {
            b[i] = rnd.nextInt(10) - 5; 
        }
        for (int i = 0; i < d.length; ++i) {
            d[i] = rnd.nextInt(10) - 5; 
        }
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < b.length; i++) {
            for(int j = 0; j < d.length; j++){
                if (b[i] == d[j]) {
                    p = false;
                }
            }
        }

            if (p == true) {
                System.out.println("array do NOT have incorrect numbers");
            } else {
                System.out.println("incorrect numbers");
            }
        System.out.println(Arrays.toString(b));
        int N;
        System.out.println("Введіть розмірність массиву");
        N = input.nextInt();
        int Max = 0, Min = 0;
        int a[][] = new int[N][N];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(101) - 50;;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (Min > a[i][j]) {
                    Min = a[i][j];
                }
                if (Max < a[i][j]) {
                    Max = a[i][j];
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Мінімальне значення: " + Min);
        System.out.println("Максимальне значення: " + Max);
    }
}
