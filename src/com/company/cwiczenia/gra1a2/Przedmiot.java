package com.company.cwiczenia.gra1a2;

public class Przedmiot {
    int zdrowie;
    int energia;
    int najedzenie;
    int nastroj;
    String nazwa;
    int cena;
    public Przedmiot(String nazwa, int zd, int en, int naj,int nas, int cena){
        this.nazwa = nazwa;
        zdrowie = zd;
        energia = en;
        najedzenie = naj;
        nastroj = nas;
        this.cena = cena;
    }
    public void uzyj(Stworek S){
        System.out.println("Uzyto " + nazwa +" na " + S.imie);
        System.out.println("Zdr: " + zdrowie +" Ene: " + energia + " Naj: " + najedzenie +" Nas: " + nastroj);
        S.setNajedzenie(najedzenie);
        S.setZdrowie(zdrowie);
        S.setEnergia(energia);
        S.setNastroj(nastroj);
    }

}
