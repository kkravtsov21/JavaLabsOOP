package laba2;



import java.util.Scanner;
public class Laba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Функція з заданими параметрами");
        System.out.println("2.Функція з випадковими параметрами");
        double a = 0.43, b = 2.17, c = 4.2, x = 0.51;
        double y1, y2;
        y1 = function(a, b, x, c);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("y = " + y1);
                break;
            case 2:
                System.out.print("Input a minimum: ");
                int min = scan.nextInt();
                System.out.print("Input a maximum: ");
                int max = scan.nextInt();
                double aa = Math.random() * (max - min) + min;
                
                double cc = Math.random() * (max - min) + min;
                double xx = Math.random() * (max - min) + min;
                while(xx>=4) {
                     xx = Math.random() * (max - min) + min;
                }
                double bb = Math.random() * (max - min) + min;
                while(bb==xx) {
                     bb = Math.random() * (max - min) + min;
                }
                
                
                System.out.println("a = " + aa);
                System.out.println("b = " + bb);
                System.out.println("c = " + cc);
                System.out.println("x = " + xx);
        double x1 = Math.pow(a+x,1.0/4.0);
        System.out.println("x1 = " + x1);
        double x2 = (Math.acos(x1));
        while(x2>=-1 && x2<=1) 
            {
                x2 = Math.random() * (max - min) + min;
            }
        System.out.println("x2 = " + x2);
        double x3 = x2/(b-x);
        System.out.println("x3 = " + x3);
        double x4 = Math.log10(4-x);
        System.out.println("x4 = " + x4);
        double x5 = Math.pow(c,x4);
        System.out.println("x5 = " + x5);
        double x6 = x3+x5;
        System.out.println("x6 = " + x6);
        y2 = function(aa, bb, xx, cc);
        System.out.println("y2 = " + y2);
        double f1 = (Math.acos(Math.pow(a+x,1.0/4.0)))/(b-x);
        System.out.println("f1 = " + f1);
        double f2 =(Math.pow(c,Math.log10(4-x)));
        System.out.println("f2 = " + f2);
        double fInal = f1+f2;
        System.out.println("final = " + fInal);
                break;
        }
    }

    static double function(double a, double b, double x, double c) {
        return ((Math.acos(Math.pow(a+x,1.0/4.0)))/(b-x))+(Math.pow(c,Math.log10(4-x)));
    }

}
