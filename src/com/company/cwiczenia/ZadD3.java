package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZadD3 {
    public static void main(String[] a) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/DC.txt");
        Scanner zPliku = new Scanner(plik);

        String[] slowa = new String[6];
        for (int i = 0; i < 6; i++) {
            slowa[i] = zPliku.nextLine();
        }
        String c;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (slowa[i].length() > slowa[i + 1].length()) {
                    c = slowa[i];
                    slowa[i] = slowa[i+1];
                    slowa[i+1] = c;
                }
            }
        }

        for(String s: slowa){
            System.out.println(s);
        }

    }
}
