package com.company.ProjektZPlikami;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Produkt> produkty;

    public Menu(String sciezkaDoPliku) throws FileNotFoundException {
        produkty = Pliki.zaladujZPliku(sciezkaDoPliku);
    }

    public void wypisz(){
        for(Produkt p: produkty){
            System.out.println(p.getNazwa());
        }
    }
}
