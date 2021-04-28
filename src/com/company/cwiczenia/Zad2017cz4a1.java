package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2017cz4a1 {

    public static void main(String[] args) throws FileNotFoundException {

        boolean[] sito = new boolean[10001];
        sito[0] = true;
        sito[1] = true;
        for(int i = 2; i < 10001; i++){
            if(sito[i]== false){
                for(int j= i+i; j <10001; j += i){
                    sito[j] = true;
                }
            }
        }

        File plik = new File("src/com/company/cwiczenia/punkty.txt");
        Scanner in = new Scanner(plik);
        int n = 0;
        for(int i = 0; i <2000; i++){
            n = in.nextInt();
            System.out.println(n + ": " + (sito[n]==false?"ok":"no"));
        }
    // Zad. dom. Dokończenie zadania 4.1 z matury 2017 czerwiec
    }
}
