package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ksiazka> biblio = new ArrayList<>();
        /* 0 */    biblio.add(new Ksiazka("Pan Tadeusz","Adam Mickiewicz",237, 1834, "czerwony"));
        /* 1 */    biblio.add(new Ksiazka("Antygona","Sofokles",37, 400, "żółty"));
        /* 2 */    biblio.add(new Ksiazka("Harry Potter","J.K. Rowling",437, 1997, "zielony"));

        biblio.get(1).wypozycz();

        for(Ksiazka k: biblio){
              k.fiszka();
        }

        System.out.println("------------");
        biblio.get(1).zwroc();

        for(Ksiazka k: biblio){
            k.fiszka();
        }

    }
}
