package com.company.gra;

public class TamagotchiE {

    public static class Stworek{
        int choroba;
        int pragnienie;
        int nuda;
        int zmeczenie;
        String imie;

        public Stworek(String imie){
            this.imie = imie;
            choroba = 0;
            pragnienie = 0;
            nuda = 0;
            zmeczenie = 0;
        }
        public void statystyki(){
            System.out.println("Stworek: " + imie);
            System.out.println("choroba: " + choroba);
            System.out.println("pragnienie: " + pragnienie);
            System.out.println("nuda: " + nuda);
            System.out.println("zmeczenie: " + zmeczenie);
        }


    }

    public static void main(String[] args){
        Stworek stwor = new Stworek("Stefan");
        stwor.statystyki();
    }

}
