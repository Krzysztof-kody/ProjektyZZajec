package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DodatkoweA {
    public static void main(String[] args) throws FileNotFoundException {
        int[] T = new int[4];
        File liczby = new File("src/com/company/cwiczenia/DA.txt");
        Scanner sc = new Scanner(liczby);
        for(int i =  0; i<4 ; i++){
            T[i] = sc.nextInt();
        }
        int c;
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                if(T[i] > T[i+1]){
                    c = T[i];
                    T[i] = T[i+1];
                    T[i+1] = c;
                }
            }
        }
        for(int l: T){
            System.out.print(l + " ");
        }
    }
}
