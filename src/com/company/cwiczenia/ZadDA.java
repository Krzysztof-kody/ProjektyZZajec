package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZadDA {
    public static void main(String[] s) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/DA.txt");
        Scanner sc = new Scanner(plik);
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            liczby.add(sc.nextInt());
        }
        Collections.sort(liczby);
        for(int l: liczby){
            System.out.println(l);
        }
    }
}
