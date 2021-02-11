package com.company;

import java.util.Scanner;

public class Zawodnik {
    private int wiek;
	private String pozycja;
	private int nr;
	private String imie;
    private String nazwisko;
    private int iloscGoli;
    private int wartoscKontraktu;
	boolean kontuzja;

    public Zawodnik(String imie, String nazwisko, int wiek, String pozycja, int nr, int iloscGoli, int wartoscKontraktu, boolean kontuzja) {
        this.wiek = wiek;
        this.pozycja = pozycja;
        this.nr = nr;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.iloscGoli = iloscGoli;
        this.wartoscKontraktu = wartoscKontraktu;
        this.kontuzja = kontuzja;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIloscGoli() {
        return iloscGoli;
    }

    public void setIloscGoli(int iloscGoli) {
        this.iloscGoli = iloscGoli;
    }

    public int getWartoscKontraktu() {
        return wartoscKontraktu;
    }

    public void setWartoscKontraktu(int wartoscKontraktu) {
        this.wartoscKontraktu = wartoscKontraktu;
    }

    public boolean isKontuzja() {
        return kontuzja;
    }

    public void setKontuzja(boolean kontuzja) {
        this.kontuzja = kontuzja;
    }
}
