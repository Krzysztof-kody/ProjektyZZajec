package com.company.cwiczenia;

import java.awt.image.RGBImageFilter;
import java.util.Scanner;

public class liczbyNaCyfry {
/*
       1011
       10110
       00001
 */
/*

    odczytaj od uzytkownika liczbe calkowita dodatnia/nieujemna
    odpowedz na pytanie - czy podana liczba jest palindromem?

    12221
    abba

 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        String c = "";
        c += a;
        while(a > 0) {
            s += (a % 10);
            a /= 10;
        }
        System.out.println(s);
        System.out.println(c);
        if(s.equals(c)){
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("nie palindrom");
        }


    }
}
