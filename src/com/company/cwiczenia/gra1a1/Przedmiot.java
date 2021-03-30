package com.company.cwiczenia.gra1a1;

public class Przedmiot {
    int zdrowie;
    int energia;
    int szczescie;
    int sytosc;
    int toaleta;
    String nazwa;
    public Przedmiot(String nazwa, int zdr, int ene, int sz, int sy, int toa){
        this.nazwa = nazwa;
        zdrowie = zdr;
        energia = ene;
        szczescie = sz;
        sytosc = sy;
        toaleta = toa;
    }
    public void uzyj(Stworek S){
        System.out.println(S.imie + " + " + nazwa);
        S.setSytosc(sytosc);
        S.setZdrowie(zdrowie);
        S.setSzczescie(szczescie);
        S.setEnergia(energia);
        S.setToaleta(toaleta);
    }
}