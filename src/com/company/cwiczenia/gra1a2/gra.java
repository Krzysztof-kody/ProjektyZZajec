package com.company.cwiczenia.gra1a2;

public class gra {

    static class Stworek{
        String kolor;
        int wiek;
        int zdrowie;
        int energia;
        int glod;
        int nastroj;
        String imie;
        public Stworek(String imie, String kolor){
            this.imie = imie;
            this.kolor = kolor;
            wiek = 100;
            zdrowie = 100;
            energia = 100;
            glod = 100;
            nastroj = 100;
        }
        public void statystyki() {
        ....
        }
    }

    public static void main(String[] args){
        Stworek tama = new Stworek("Stefan", "różowy");
        tama.statystyki();
    }

}
