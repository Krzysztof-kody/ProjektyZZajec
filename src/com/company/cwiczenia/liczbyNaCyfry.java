package com.company.cwiczenia;

import java.awt.image.RGBImageFilter;

public class liczbyNaCyfry {
    public static void main(String[] args){
        int a = 3223;
        int b = 0;
        int dzielnik = 1;
        /*
        while(dzielnik < a) {
            System.out.println((a % (dzielnik * 10)) / dzielnik);
            dzielnik *= 10;
        }*/

        while(a>0) {
            b = b*10 + a%10;
            System.out.println((a % 10));
            a = a / 10;
        }

        System.out.println(b);


    }
}
