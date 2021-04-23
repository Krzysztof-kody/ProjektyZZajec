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
/*
    1234 %10 /10
          4    123
          3    12
          2    1
          1    0
 */
    static void liczba2array(int n, int[] b){
        for(int i = 5; i >= 0; i--){
            b[i] = n % 10;
            n /= 10;
        }
    }
    static int silnia(int n){
        if(n == 0) return 1;
        return silnia(n-1)*n;
    }

    static void zad42() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int licznik = 0;
        for(int i = 0 ; i < 500; i++) {
            if (czyPotega3(in.nextInt()) == true) {
                licznik++;
            }
        }
        System.out.println(licznik);
        in.close();
        in = new Scanner(plik);
        for(int i = 0 ; i < 500; i++) {
            int[] b = new int[6];
            int suma = 0;
            int liczba = in.nextInt();
            boolean pisz = false;
            liczba2array(liczba, b);
            for (int l : b) {
                if ((l > 0) && (pisz == false)) pisz = true;
                if (pisz) {
                    suma += silnia(l);
                }
            }
            if(suma == liczba)
                System.out.println(liczba + ", " + suma + " : " + (suma == liczba));
        }
    }

    static int NWD(int a, int b){

        while(b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
/*
        b > 0
            a = b, b = a % b

        f(a, b) =   b > 0; f(b, a % b)
                    b == 0; a
 */
    static int NWDr(int a, int b){
        if(b == 0) return a;
        return NWDr(b, a % b);
    }

    static int NWDrr(int a, int b){
        return b==0?a:NWDrr(b, a % b);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int[] liczby = new int[500];
        int l = 0;
        while(in.hasNext()) {
            liczby[l] = in.nextInt();
            l++;
        }
        int dl = 0;
        int dlMax = 0;
        int p = 0,k = 0;
        for(int i = 0; i < l-1; i++){
            dl = 0;
            int nwd = NWD(liczby[i],liczby[i+1]);
            if(nwd > 1){
                dl = 2;
                for(int j = i+2; j < l; j++){
                    nwd = NWD(nwd, liczby[j]);
                    if(nwd == 1){
                        break;}
                    dl++;
                }
            if(dlMax < dl) {
                dlMax = dl;
                p = i;
                k = i + dl - 1;
            }
        }}
        System.out.println(dlMax + " " + p + " " + k);
        System.out.println(liczby[p] + " " + liczby[k]);
        System.out.println(NWD(liczby[p],liczby[k]));
        System.out.println(NWD(liczby[p], liczby[p+1]));
    }
}
