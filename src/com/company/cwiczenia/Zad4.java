package com.company.cwiczenia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//4. Odczytać z pliku 2 wartośi liczbowe, zsumować je i dopisać sumę do pliku
public class Zad4 {
 public static void main(String[] args) throws IOException {

     int suma = 0;
     File dane = new File("src/com/company/cwiczenia/Zad4.txt");
     Scanner sc = new Scanner(dane);
     suma += sc.nextInt();
     suma += sc.nextInt();

     System.out.println(suma);
     FileWriter fw = new FileWriter("src/com/company/cwiczenia/Zad4.txt", true);
     PrintWriter pw = new PrintWriter(fw);
     pw.println();
     pw.println(suma);
     pw.close();

 }

}
