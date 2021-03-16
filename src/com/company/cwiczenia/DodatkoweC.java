package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DodatkoweC {


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> slowa = new ArrayList<>();
        File plik = new File("src/com/company/cwiczenia/DC.txt");
        Scanner sc = new Scanner(plik);
        for (int i = 0; i < 6; i++) {
            slowa.add(sc.nextLine());
        }
        String c;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(slowa.get(j).length() > slowa.get(j+1).length()){
                    c = slowa.get(j);
                    slowa.set(j, slowa.get(j + 1));
                    slowa.set(j+1, c);
                }
            }
        }
        for(String s: slowa){
            System.out.print(s + " ");
        }
    }
}
