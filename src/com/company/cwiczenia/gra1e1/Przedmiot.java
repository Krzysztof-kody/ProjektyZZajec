package com.company.cwiczenia.gra1e1;

public class Przedmiot {
    int zdrowie;
    int sytosc;
    int pecherz;
    int zabawa;
    String nazwa;

    public Przedmiot(String nazwa, int zdrowie, int sytosc, int pecherz, int zabawa){
        this.nazwa = nazwa;
        this.zdrowie = zdrowie;
        this.pecherz = pecherz;
        this.sytosc = sytosc;
        this.zabawa = zabawa;
    }
    public void uzyj(Stworek S){
        System.out.println(S.imie + " + " + nazwa);
        S.setPecherz(pecherz);
        S.setSytosc(sytosc);
        S.setZdrowie(zdrowie);
        S.setZabawa(zabawa);
    }


}
