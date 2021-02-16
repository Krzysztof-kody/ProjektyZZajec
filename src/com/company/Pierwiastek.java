package com.company;

import java.util.Scanner;

public class Pierwiastek {

    public static double pierw2(double a, double b, double x){
        double eps = 0.0001;
        double sr =(a+b)/2;

        if((b - a) < eps) return sr;
        if ((sr * sr) < x) return pierw2(sr,b,x);
        return pierw2(a,sr,x);

    }
    public static double pierw(double x){
        if(x<1)
            return pierw2(x, 1, x);
        else
            return pierw2(0, x, x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(pierw(x));

        /*
        double eps = 0.0001;

        double a = 0, b = x;
        double sr = (a + b)/2.0;

        while((b - a) > eps) {
            if ((sr * sr) < x)
                a = sr;
            else
                b = sr;
            sr = (a + b)/2.0;
        }
        System.out.println(sr);

         */
    }
}
