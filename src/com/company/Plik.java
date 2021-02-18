package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Plik {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Zawodnik> zespol = new ArrayList<>();

        File file = new File("zespol.txt");
        Scanner in = new Scanner(file);
        PrintWriter zapis = new PrintWriter("zespol1.txt");

        while(in.hasNext()) {
            Zawodnik tmp = new Zawodnik();
            tmp.setImie(in.nextLine());
            tmp.setNazwisko(in.nextLine());
            tmp.setWiek(in.nextInt());
            in.nextLine();
            tmp.setPozycja(in.nextLine());
            tmp.setIloscGoli(in.nextInt());
            tmp.setNr(in.nextInt());
            tmp.setWartoscKontraktu(in.nextInt());
            if(in.hasNext())
                in.nextLine();
            zespol.add(tmp);
        }
        zespol.get(0).statystyka();
        zespol.get(1).statystyka();
    }
}
