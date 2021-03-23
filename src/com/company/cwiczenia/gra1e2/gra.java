package com.company.cwiczenia.gra1e2;

public class gra {

    static class Ludek{
        int zdrowie;
        int szczescie;

        public Ludek(){
            zdrowie = 100;
            szczescie = 100;
        }

    }
    public static void main(String[] args){
        Ludek lu = new Ludek();
        lu.statystyki();
    }
}
