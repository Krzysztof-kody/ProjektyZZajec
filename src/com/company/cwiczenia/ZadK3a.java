package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
a)  Odczytać z pliku Zad1.txt liczby i słowa
	policzyć ile razy występują słowa w tym pliku
	wyświetlić wynik na ekran w następujący sposób (zamiast znaków zapytania wartość):
	Slowa wystepują: ???razy
 */
public class ZadK3a {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/zZad1.txt");
        Scanner in = new Scanner(plik);
        int ile = 0;
        while(in.hasNextLine()){
            if(in.nextLine().equals("slowo")) {
                ile++;
            }
        }
        System.out.println("Slowa wystepują: " + ile+ "razy");

    }
}
