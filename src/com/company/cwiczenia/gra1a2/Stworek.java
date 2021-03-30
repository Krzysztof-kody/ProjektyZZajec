package com.company.cwiczenia.gra1a2;

public class Stworek{
    String kolor;
    int wiek;
    int zdrowie;
    int energia;
    int najedzenie;
    int nastroj;
    String imie;
    boolean gramy;
    public Stworek(String imie, String kolor){
        this.imie = imie;
        this.kolor = kolor;
        wiek = 100;
        zdrowie = 30;
        energia = 100;
        najedzenie = 70;
        nastroj = 100;
        gramy = true;
    }
    public String pasek(int n){
        String p = "";
        p += "|";
        for (int i = 0; i < n/5; i++) {
            p += "#";
        }
        for (int i = 0; i < 20 - n/5; i++) {
            p +=" ";
        }
        p += "|";

        return p;
    }
    public void statystyki() {
        System.out.println("Imie " + imie);
        System.out.println("Kolor " + kolor);
        System.out.println("Wiek " + wiek);
        System.out.println("Zdrowie " + pasek(zdrowie));
        System.out.println("Energia " + pasek(energia));
        System.out.println("Sytosc  " + pasek(najedzenie));
        System.out.println("Nastrój " + pasek(nastroj));
    }


    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        if(this.zdrowie > 0) {
            this.zdrowie += zdrowie;
            if (this.zdrowie > 100) {
                this.zdrowie = 100;
                setNastroj(+10);
            }
            if (this.zdrowie < 0) {
                this.zdrowie = 0;
                setEnergia(-20);
                setNastroj(-20);
            }
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(this.energia > 0){
            this.energia += energia;
            if(this.energia > 100){
                this.energia = 100;
                setZdrowie(+10);
            }
            if(this.energia < 0){
                this.energia = 0;
                setZdrowie(-20);
                setNastroj(-20);
            }
        }
    }

    public int getNajedzenie() {
        return najedzenie;
    }

    public void setNajedzenie(int najedzenie) {
        if(this.najedzenie > 0) {
            this.najedzenie += najedzenie;
            if (this.najedzenie > 100) {
                this.najedzenie = 100;
                System.out.println("PRZEJEDZENIE!!!");
                setNastroj(-20);
                setEnergia(-20);
            }
            if (this.najedzenie < 0) {
                this.najedzenie = 0;
                setNastroj(-20);
                setEnergia(-20);
                setZdrowie(-20);
            }
        }
    }

    public int getNastroj() {
        return nastroj;
    }

    public void setNastroj(int nastroj) {
        if(this.nastroj > 0) {
            this.nastroj += nastroj;
            if (this.nastroj > 100) {
                this.nastroj = 100;
            }
            if (this.nastroj < 0) {
                this.nastroj = 0;
                setZdrowie(-20);
                setEnergia(-20);
            }
        }
    }
    public void podsumowanie(){
        if(this.zdrowie == 0) {System.out.println("Twój stworek odszedł"); gramy = false;}
        if(this.energia == 0) {System.out.println("Twój stworek stracił przytomnosc"); gramy = false;}
        if(this.najedzenie == 0) {System.out.println("Twój stworek został zagłodzony"); gramy = false;}
        if(this.nastroj == 0) {System.out.println("Twój stworek nie ma juz na nic ochoty"); gramy = false;}
    }
}
