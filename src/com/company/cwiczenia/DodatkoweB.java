package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Wczytać z pliku 6 liczb i 2 słowa. Wypisać pierwsze słowo n razy
// (n - największa liczba) oraz drugie słowo m razy (m - najmniejsza liczba).

public class DodatkoweB {
    public static void main(String[] args) throws FileNotFoundException {
        File liczby = new File("src/com/company/cwiczenia/DB.txt");
        Scanner sc = new Scanner(liczby);
        int n = sc.nextInt();
        int m = n;
        int c;
        String slowo;
        for(int i =  1; i<6 ; i++){
            c = sc.nextInt();
            if(n < c){
                n = c;
            }
            if(m > c){
                m = c;
            }
        }
        sc.nextLine();
        slowo = sc.nextLine();
        for(int j = 0; j < n; j++)
            System.out.print(slowo + " ");
        System.out.println();
        slowo = sc.nextLine();
        for(int j = 0; j < m; j++)
            System.out.print(slowo + " ");
    }

}

