package com.company.cwiczenia.gra1a1;

public class gra {


    static class Stworek{
        int zdrowie;
        int energia;
        int szczescie;
        int sytosc;
        int toaleta;
        String imie;
        public Stworek(String imie){
            this.imie = imie;
            zdrowie = 100;
            energia = 50;
            szczescie = 100;
            sytosc = 100;
            toaleta = 100;
        }
        public void przywitajSie(){
            System.out.println("Cześć, jestem " + imie + "!");
        }

        public String pasek(int n, int max){
            String p ="";
            p += "|";
            for(int i =0; i<n/5; i++)
                p +="#";
            for(int i =0; i<(max-n)/5; i++)
                p +=" ";

            p += "|";

            return p;
        }

        public void statystyki(){

            System.out.println("Zdrowie: " + pasek(zdrowie, 100));
            System.out.println("Energia: " + pasek(energia, 100));
        }

        public void nakarm(int kcal){
            sytosc += kcal;
        }

    }

    public static void main(String[] args){

        Stworek tama = new Stworek("Stefan");
        tama.przywitajSie();
        tama.statystyki();
    }

}
