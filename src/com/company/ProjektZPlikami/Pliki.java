package com.company.ProjektZPlikami;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pliki {
    public static ArrayList<Produkt> zaladujZPliku(String sciezkaDoPliku) throws FileNotFoundException {
        File plik = new File(sciezkaDoPliku);
        Scanner in = new Scanner(plik);
        in.useDelimiter(";\\s*");   /* \\s* - oznacza dowolną ilość białych znaków (whitespace character)
                                        potrzebne tutaj by w nowej linii nie czytać znaków końca poprzedniej linii
                                    */
        ArrayList<Produkt> tmp = new ArrayList<>();


        while(in.hasNext()){
            String typ = in.next();

            switch (typ.charAt(0)) {
                case 'P':   tmp.add(new Posilek(typ, in.next(), in.nextInt(), in.nextDouble(), in.next(),in.nextInt()));
                            break;
                case 'N':   tmp.add(new Napoje(typ, in.next(), in.nextInt(), in.nextDouble(), in.next(), in.nextInt()));
                            break;
                default:    tmp.add(new Produkt(typ, in.next(), in.nextInt(), in.nextDouble(), in.next()));
            }
        }
        return tmp;
    }
}
