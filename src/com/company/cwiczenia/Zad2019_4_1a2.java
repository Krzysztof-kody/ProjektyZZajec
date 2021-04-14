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

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner in = new Scanner(plik);

        for(int i=0; i< 500; i++) {
            if (czyPotegaTrojki(in.nextInt()))
                System.out.println("tak");
            else
                System.out.println("nie");
        }
    }
}
