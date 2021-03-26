package com.company.cwiczenia;

public class Poczatki {



    public static void main(String[] nazwa){

        Czlowiek Adam = new Czlowiek();
        System.out.println(Adam.imie + " " + Adam.waga);
        Czlowiek Ewa = new Czlowiek("Ewa", 170, 50);
        System.out.println(Ewa.imie + " " + Ewa.wzrost);
        System.out.println(Ewa.czyDzielnik(14, 4));
        Ewa.nazwisko = "Nowak";
        System.out.println(Ewa.nazwisko);
        System.out.println(Adam.nazwisko);
    }
}
