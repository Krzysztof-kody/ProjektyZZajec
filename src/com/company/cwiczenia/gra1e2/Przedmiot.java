package com.company.cwiczenia.gra1e2;

public class Przedmiot {
    int zdrowie;
    int szczescie;
    int zmeczenie;
    int czystosc;
    int najedzenie;
    String nazwa;
    int cena;

    public Przedmiot(String nazwa, int zd, int sz, int zm, int cz, int naj, int cena){
        this.nazwa = nazwa;
        zdrowie = zd;
        szczescie = sz;
        zmeczenie = zm;
        czystosc = cz;
        najedzenie = naj;
        this.cena = cena;
    }
    public void uzyj (Ludek L){
        L.setCzystosc(czystosc);
        L.setNajedzenie(najedzenie);
        L.setSzczescie(szczescie);
        L.setZmeczenie(zmeczenie);
        L.setZdrowie(zdrowie);
    }


}
