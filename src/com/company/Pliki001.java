package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pliki001 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("uczniowie.txt");
        Scanner in = new Scanner(file);
        ArrayList<Uczen> uczniowie = new ArrayList<>();

        while(in.hasNext()){
            Uczen tmp = new Uczen();
            tmp.setImie(in.nextLine());
            tmp.setNazwisko(in.nextLine());
            tmp.setKlasa(in.nextInt());
            uczniowie.add(tmp);
            if(in.hasNext()){
                in.nextLine();
            }
        }
        for(Uczen u: uczniowie){
            u.informacjeOUczniu();
        }

    }

}
