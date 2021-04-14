package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

https://classroom.google.com/u/1/c/MTU2ODA3MzkwNDAy
Matura 2019
zadanie 4

 */
public class Zad2019_4_1a1 {

    static boolean czyPotega3(int a){
        while(a > 1) {
            if(a % 3 != 0)
                a = 0;
            a /= 3;
        }
        return a==0?false:true;
    }

    static void liczba2array(int n, int[] b){
        for(int i = 0; i < 6; i++){
            b[i] = n % 10;
            n /= 10;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int licznik = 0;
        for(int i = 0 ; i < 500; i++) {
            if (czyPotega3(in.nextInt()) == true) {
                licznik++;
            }
        }
        System.out.println(licznik);

        int[] b = new int[6];
        liczba2array(1234, b);
        for(int l: b){
            System.out.println(l);
        }

    }
}
