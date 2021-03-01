package com.company.ProjektZPlikami;

public class Produkt {
    protected String kod;
    protected String nazwa;
    protected int waga;
    protected double cena;
    protected String opis;


    public Produkt(String kod, String nazwa, int waga, double cena, String opis){
        this.kod = kod;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.opis = opis;
    }

    public Produkt() {
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
