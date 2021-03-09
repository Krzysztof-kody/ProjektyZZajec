package com.company.cwiczenia;

import java.io.*;
import java.util.Scanner;

public class OdczytIZapis {
    public static void main(String[] args) throws IOException {
        File liczby = new File("src/com/company/cwiczenia/liczby.txt");
        Scanner sc = new Scanner(liczby);
        int wynik = sc.nextInt() + sc.nextInt();

        FileWriter fw = new FileWriter("src/com/company/cwiczenia/liczby.txt",true);
        PrintWriter out = new PrintWriter(fw);
        out.println(wynik);
        out.close();
    }
}
