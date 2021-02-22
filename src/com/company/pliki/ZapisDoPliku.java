package com.company.pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZapisDoPliku {
    public static void main(String[] args) throws FileNotFoundException {
    // tworzymy obiekt klasy PrintWriter by móc pisać do pliku
    // plik w chwili podłączenia do ProntWritera zostaje stworzony/oczyszczony (pozbawiony zawartośći)
        PrintWriter out = new PrintWriter("src/com/company/pliki/daneOut.txt");
        for(int i = 0; i < 10; i++) {
            out.println(i);
        }
        out.close();
    }
}
