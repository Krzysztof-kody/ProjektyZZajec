package com.company.cwiczenia;
/*

https://classroom.google.com/u/1/c/MTU2ODA3MzkwNDAy
Matura 2019

 */
public class Zad2019_4_1a1 {

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
