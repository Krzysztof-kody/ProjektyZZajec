package com.company;

import java.util.Scanner;

public class Pierwiastek {

    public static double pierw3(double a, double b, double x, int n){
        double eps = 0.0001;
        double sr =(a+b)/2;
        double pot = 1;
        if((b - a) < eps) return sr;
        for(int i = 0 ; i < n; i++)
            pot *= sr;
        if (pot < x) return pierw3(sr,b,x,n);
        return pierw3(a,sr,x,n);

    }


    public static double pierw2(double a, double b, double x){
        double eps = 0.0001;
        double sr =(a+b)/2;

        if((b - a) < eps) return sr;
        if ((sr * sr) < x) return pierw2(sr,b,x);
        return pierw2(a,sr,x);

    }
    public static double pierw(double x){
        if(x<1)
            return pierw3(x, 1, x,2);
        else
            return pierw3(0, x, x, 2);
    }

    public static double pierw(double x, int n){
        if(x<1)
            return pierw3(x, 1, x,n);
        else
            return pierw3(0, x, x, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(pierw(x,3));

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
