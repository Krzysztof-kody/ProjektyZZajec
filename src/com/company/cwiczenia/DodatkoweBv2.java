package com.company.cwiczenia;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Wczytać z pliku 6 liczb i 2 słowa. Wypisać pierwsze słowo n razy
// (n - największa liczba) oraz drugie słowo m razy (m - najmniejsza liczba).
public class DodatkoweBv2 {
public static void main(String[] args) throws FileNotFoundException {
    ArrayList<Integer> liczby = new ArrayList<>();
    File plik = new File("src/com/company/cwiczenia/DB.txt");
    Scanner sc = new Scanner(plik);
    for (int i = 0; i < 6; i++) {
        liczby.add(sc.nextInt());
    }
    int m = Collections.min(liczby);
    int n = Collections.max(liczby);
    sc.nextLine();
    String sl = sc.nextLine();
    for (int i = 0; i < n; i++) {
        System.out.print(sl + " ");
    }
    System.out.println();
    sl = sc.nextLine();
    for (int i = 0; i < m; i++) {
        System.out.print(sl + " ");
    }
}
}
