package com.company.pliki;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DodawanieDoPlikow {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/com/company/pliki/daneOut.txt", true); //ustawienie true by dodawać do pliku
        PrintWriter out = new PrintWriter(fw);
        for(int i = 1; i < 10; i*=3){
            out.println(i+10);
        }
        out.close(); // pamiętaj o zamknięciu pliku by zapisać/wprowadzić zmiany w pliku
    }
}
