package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2019_4_1a2 {

    static boolean czyPotegaTrojki(int a){
        while(a > 1){
            if(a % 3 == 0)
                a /=3;
            else
                return false;
        }
        return true;
    }

    static int silnia(int n){
        if(n == 0)
            return 1;
        return silnia(n-1)*n;
    }
    static int liczbaNaCyfry(int n, int[] cyfry){

        int liczbaJednosci;
        int i = 0;
        while(n > 0) {
            liczbaJednosci = n % 10;
            n /= 10;
            cyfry[i] = liczbaJednosci;
            i++;
        }
        return i;
    }

    static int NWD1(int a, int b){
        while(a!=b){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    static int NWD2(int a, int b) {
        int r;
        while(b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int NWD3(int a, int b){
        if(b > 0) return NWD3(b, a%b);
        return a;
    }
    static int NWD3b(int a, int b){
        return b == 0?a:NWD3(b, a%b);
    }

    static void zadZSilnia() throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);
        int licznik = 0;
        for(int i=0; i< 500; i++) {
            if (czyPotegaTrojki(in.nextInt()))
                licznik++;
        }

       // System.out.println(licznik);
        in.close();
        in = new Scanner(plik);
        for(int k=0; k< 500; k++) {
            int liczba = in.nextInt();
            int[] tab = new int[6];
            int i = liczbaNaCyfry(liczba, tab);
            int suma = 0;
            for (int j = 0; j < i; j++) {
                suma += silnia(tab[j]);
            }
            if(liczba == suma)
                System.out.println(liczba + ", " + suma + " : " + (liczba == suma));
        }
    }

        public static void main(String[] args) throws FileNotFoundException {
     /*
     2 6 3 9
     */
            File plik = new File("src/com/company/cwiczenia/liczby.txt");
            Scanner in = new Scanner(plik);
            int[] liczby = new int[500];
            int n = 0;
            int nwdTMP;
            int maxA = 1;
            int a = 0;
            int b = 0;
            int c = 0;
            while(in.hasNext()){
                liczby[n] = in.nextInt();
                n++;
            }
            int j = 0;
            for(int i = 0; i < 500-1; i++){
                a = 0;
                nwdTMP = NWD1(liczby[i], liczby[i+1]);
                j = i+2;
                if(nwdTMP > 1) {
                    a = 2;
                    while ((nwdTMP > 1) && (j < 500)) {
                        nwdTMP = NWD1(nwdTMP, liczby[j]);
                        if(nwdTMP == 1) break;
                        j++;
                        a++;
                    }
                    if (maxA < a) {
                        maxA = a;
                        b = i;
                        c = j - 1;
                    }
                }
            }
            System.out.println(maxA + " " + liczby[b] + " " + liczby[c] );
    }
}
