package com.company.ProjektZPlikami;

public class Napoje extends Produkt{
    public int procenty;
    public Napoje(String kod, String nazwa, int waga, double cena, String opis, int procenty){
        this.kod = kod;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.opis = opis;
        this.procenty = procenty;
    }
}
