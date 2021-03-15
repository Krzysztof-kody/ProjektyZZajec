package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Wczytac z pliku 4 liczby i wypisac je rosnaco
public class DodatkoweAv2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        File dane = new File("src/com/company/cwiczenia/DA.txt");
        Scanner sc = new Scanner(dane);
        for (int i = 0; i < 4; i++) {
            liczby.add(sc.nextInt());
        }
        Collections.sort(liczby);
        for(int l: liczby){
            System.out.println(l);
        }

    }
}
