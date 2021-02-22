package com.company.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytZPliku {

    public static void main(String[] args) throws FileNotFoundException {
    // tworzymy zmienną plikową - podłącza plik do naszego programu
        File plik = new File("src/com/company/pliki/dane.txt");

    // ustawiamy scanner by czytał z pliku a nie z konsoli
        Scanner in = new Scanner(plik);

    // pętla czytająca z pliku
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }
}
