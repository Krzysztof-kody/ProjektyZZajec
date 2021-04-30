package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2017cz4 {

    public static boolean czyCyfropodobne(String a, String b){
        boolean[] A = new boolean[10];
        boolean[] B = new boolean[10];

        for(int i = 0 ; i< a.length(); i++){
          //  '1' -/-> 1
          //  '1' - '0' == 1      '0', '1','2' ....
            A[a.charAt(i)-'0'] = true;
        }
        for(int i = 0 ; i< b.length(); i++){
            B[b.charAt(i)-'0'] = true;
        }

        for(int i =0; i< 10; i++){
            if(A[i]!=B[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/punkty.txt");
        Scanner sc = new Scanner(plik);

        boolean[] lPierwsze = new boolean[10001];

        lPierwsze[0] = true;
        lPierwsze[1] = true;

        for(int i = 2; i <10001; i++){
            if(lPierwsze[i] == false) {
                for (int j = i * 2; j < 10001; j += i) {
                    lPierwsze[j] = true; }
            } }
        int licznik = 0;
        int n = 0;
        int m = 0;
        for(int i=0; i<1000; i++){
            n = sc.nextInt();
            m= sc.nextInt();
            if(lPierwsze[m] == false &&  lPierwsze[n]==false){
                licznik++;
            }
        }
        System.out.println(licznik);
/*
        if(czyCyfropodobne("1023","2223111")){
            System.out.println("tak");
        }
        else {
            System.out.println("nie");
        }*/
    }
}
