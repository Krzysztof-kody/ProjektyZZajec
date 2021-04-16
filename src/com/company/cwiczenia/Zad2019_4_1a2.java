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

    public static void main(String[] args) throws FileNotFoundException {
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
}
