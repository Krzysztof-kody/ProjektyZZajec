package com.company;

import java.util.Scanner;

public class Pierwiastek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
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
    }
}
