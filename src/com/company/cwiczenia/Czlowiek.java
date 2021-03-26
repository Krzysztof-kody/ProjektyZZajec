package com.company.cwiczenia;

public class Czlowiek {
    String imie;
    int wzrost;
    int waga;

    public static String nazwisko;

    public boolean czyDzielnik(int n, int dzielnik){
        if( n % dzielnik == 0){
            return true;
        }
        return false;
    }
    public Czlowiek(){
        wzrost = 180;
        waga = 80;
    }
    public Czlowiek(String imie, int wzrost, int waga){
        this.wzrost = wzrost;
        this.waga = waga;
        this.imie = imie;
    }
}
