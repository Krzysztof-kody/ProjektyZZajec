package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class zad2019_4_1e2 {
    static boolean czyPotega3(int n){
        while(n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }

    static void zad42() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int k = 11;
        int[] potegi = new int[k];
        int ile = 0;
        /*
        int n = 123;

        int k = 11;
        int[] potegi = new int[k];
        if (czyPotega3(n))
            System.out.println("tak");
        else
            System.out.println("nie");
            */

//------------------------------------------------------------
        for (int i = 1, j = 0; i <= 100000; i = i * 3, j++) {
            potegi[j] = i;
            System.out.println(j + ". " + i);
        }
        while (in.hasNext()) {
            boolean czy = false;
            int kk = in.nextInt();
            for (int pot : potegi) {
                if (pot == kk) {
                    czy = true;
                    break;
                }
            }
            if(czy) {
                ile++;
                System.out.println(kk + ": tak (" + ile + ")");
            }
        }
    }
    static int silnia(int n){
        int wynik = 1;
        while(n > 0){
            wynik *= n;
            n--;
        }
        return wynik;
    }

    static void zad42b() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);

        for(int i=0; i < 500; i++) {
            int r = 0;
            int suma = 0;
            int k = in.nextInt();
            int kk = k;
            while (k > 0) {
                r = k % 10;
                suma += silnia(r);
                k /= 10;
            }
            if(kk == suma)
                System.out.println(kk);
        }
    }
    static int NWD(int a, int b){
        while(a !=b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    // psvm
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        ArrayList<Integer> dl = new ArrayList<>();
        int dlMax = 0;
        int[] liczby = new int[500];
        for(int i =0; i <500; i++){
            liczby[i] = in.nextInt();
        }
        int pocz =0 , koniec = 0;
        int tmpNWD = 0;
        int j = 0;
        int i;
        for(i =0; i < 499; i++){
            j = 0;
            tmpNWD = NWD(liczby[i], liczby[i+1]);
            for(j = i+2; j < 500; j ++){
                tmpNWD = NWD(tmpNWD, liczby[j]);
                if(tmpNWD == 1) break;
            }
            System.out.println(i + " : " + (j-1));
            dl.add((j-i));
            if(dlMax < (j-i)){
                dlMax = j-i;
                pocz = i;
                koniec = j-1;
            }

        }
        Collections.sort(dl);
        System.out.println(dl.get(dl.size()-1));
        System.out.println(dlMax + " [" + pocz + ", " + koniec + "]" );

        // 2 4 6 8 7
// 0 1 2 3 4
//   i 2 2 2 1
//   i = 0
//   j = 4

    }
    }

