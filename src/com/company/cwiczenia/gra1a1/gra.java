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
            energia = 100;
            szczescie = 100;
            sytosc = 100;
            toaleta = 100;
        }
        public void przywitajSie(){
            System.out.println("Cześć, jestem " + imie + "!");
        }

        public void statystyki(){

            System.out.print("Zdrowie: ");
            for(int i =0; i<zdrowie/10; i++) System.out.print("#");
            System.out.println();

            System.out.println("Zdrowie: " + zdrowie);
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
