package com.company.cwiczenia.gra1a2;

public class gra {

    static class Stworek{
        String kolor;
        int wiek;
        int zdrowie;
        int energia;
        int najedzenie;
        int nastroj;
        String imie;
        public Stworek(String imie, String kolor){
            this.imie = imie;
            this.kolor = kolor;
            wiek = 100;
            zdrowie = 30;
            energia = 100;
            najedzenie = 100;
            nastroj = 100;
        }
        public String pasek(){
            String p = "";
            p += "|";
            for (int i = 0; i < zdrowie/5; i++) {
                p += "#";
            }
            for (int i = 0; i < 20 - zdrowie/5; i++) {
                System.out.print(" ");
            }
            System.out.print("|");

            return p;
        }
        public void statystyki() {
            System.out.println("Imie " + imie);
            System.out.println("Kolor " + kolor);
            System.out.println("Wiek " + wiek);
            System.out.println("Zdrowie " + zdrowie);
            System.out.println("Energia " + energia);
            System.out.println("Sytosc " + najedzenie);
            System.out.println("Nastrój " + nastroj);
        }
    }

    public static void main(String[] args){
        Stworek tama = new Stworek("Stefan", "różowy");
        tama.statystyki();
    }

}
