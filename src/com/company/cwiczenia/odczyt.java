package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class odczyt {
    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("src/com/company/cwiczenia/pliki");
        Scanner sc = new Scanner(plik);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }
}
