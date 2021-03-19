package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
a)	Pobrać od użytkownika liczbę całkowitą n
	Wpisać do pliku Zad1.txt n razy poniższe dane (slowo i liczbę):
	slowo
	123
 */
public class ZadK1a {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        File plik = new File("src/com/company/cwiczenia/zZad1.txt");
        Scanner in = new Scanner(plik);
        PrintWriter pw = new PrintWriter("src/com/company/cwiczenia/zZad1.txt");
        for (int i = 0; i < liczba; i++) {
            pw.println("slowo");
            pw.println(123);
        }
        pw.close();
    }
}
