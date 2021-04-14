package com.company.cwiczenia;

public class Zad20204_1a1 {

    public static void main(String[] args){
        int a = 81;
        int licznik = 0;
        while(a > 1) {
            if(a % 3 != 0)
                a = 0;
            a /= 3;
        }
        if(a == 1)
            licznik++;

        System.out.println(licznik);
    }
}
