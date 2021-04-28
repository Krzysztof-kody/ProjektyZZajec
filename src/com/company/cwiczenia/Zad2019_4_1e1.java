package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2019_4_1e1 {
    static void zad41a() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int[] pot3 = new int[11];
        int li;
        int licznik = 0;
        pot3[0] = 1;
        for(int i = 1 ; i<11; i++)
        {
            pot3[i] = pot3[i-1] * 3;
        }
        while(in.hasNext()){
            li = in.nextInt();
            for(int n: pot3){
                if(li == n){
                    //System.out.println(n);
                    licznik++;
                    break;
                }
            }
        }
        System.out.println(licznik);
    }
    static void zad41b() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int li;
        int licznik = 0;
        while(in.hasNext()) {
            li = in.nextInt();
            while(li > 1){
                if(li % 3 == 0){
                    li /= 3;
                }
                else
                    break;
            }
            if(li ==1)
                licznik++;
        }
        System.out.println(licznik);
    }

    static int silnia(int n){
        int silnia = 1;
        for(int i = 1; i <= n; i++){
            silnia *= i;
        }
        return silnia;
    }

    static int silnia1(int n){
        if(n == 0) return 1;
        return n * silnia1(n-1);
    }
    static void zad42() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int[] silnie = new int[10];
        for (int i = 0; i < 10; i++) {
            silnie[i] = silnia(i);
        }
        while(in.hasNext()) {
            int n = in.nextInt();
            int n1 = n;
            int suma = 0;
            while (n > 0) {
                suma += silnie[(n % 10)];
                n /= 10;
            }
            if (suma == n1)
                System.out.println(suma);
        }
    }

    static int NWD(int a, int b){
        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static int NWD1(int a, int b){
       if( a % b != 0) return NWD1(b, a % b);
        else return b;
    }
    static int NWD2(int a, int b){
        return a%b!=0?NWD2(b, a % b):b;
    }

    public static void main(String[] args) throws FileNotFoundException {
       //zad41a();
       //zad41b();
        //zad42();
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int[] liczby = new int[500];
        for(int i = 0; i < 500; i++)
        {
            liczby[i] = in.nextInt();
        }
        int aktNWD = 0;
        int dl = 0;
        int dlMax = 0;
        int pos = 0;
        int pocz = 0;
        int j = 0;
        for(int i = 0; i < 499; i++){
            dl = 1;
            aktNWD = NWD2(liczby[i], liczby[i+1]);
            if(aktNWD > 1){
                dl = 2;
                for(j = i+2; j < 500; j++){
                    aktNWD = NWD2(aktNWD, liczby[j]);
                    if(aktNWD == 1) {
                        break;
                    }
                    dl++;
                }
                if(dl > dlMax) {
                    dlMax = dl;
                    pos = j-1;
                    pocz = i;
                }
            }
        }
        System.out.println(dlMax);
        System.out.println(pocz + " " + pos);
        System.out.println(liczby[pocz]);
        System.out.println(liczby[pos]);

    }
}
