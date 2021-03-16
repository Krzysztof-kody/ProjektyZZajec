package com.company.cwiczenia;

import java.io.*;
import java.util.Scanner;

public class Zad4v2 {
    // 4. Odczytać z pliku 2 wartośi liczbowe, zsumować je i dopisać sumę do pliku
    public static void main(String[] args) throws IOException {
       File plik = new File("src/com/company/cwiczenia/Zad4.txt");
       Scanner zPliku = new Scanner(plik);
       int suma = zPliku.nextInt();
       suma += zPliku.nextInt();
       zPliku.close();
       FileWriter fw = new FileWriter("src/com/company/cwiczenia/Zad4.txt", true);
       PrintWriter pr = new PrintWriter(fw);
       pr.println(suma);
       pr.close();

    }

}
