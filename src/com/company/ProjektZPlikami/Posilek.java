package com.company.ProjektZPlikami;

public class Posilek extends Produkt{

    private int kalorie;
    public Posilek(String kod, String nazwa, int waga, double cena, String opis, int kalorie){
        this.kod = kod;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.opis = opis;
        this.kalorie = kalorie;
    }
}
