package com.company.cwiczenia.gra1e2;

public class gra {

    static class Ludek{
        int zdrowie;
        int szczescie;

        public Ludek(){
            zdrowie = 100;
            szczescie = 100;
        }

        public String pasek(int n){
            String p = "";
        //    |###                  |
            int ileHashy = n / 5;
            int ileSpacji = 20 - ileHashy;

            p += "|";
            for(int i= 0; i<ileHashy; i++){
                p+= "#";
            }
            for(int i= 0; i<ileSpacji; i++){
                p+= " ";
            }
            p +="|";

            return p;
        }

        public void statystyki() {
            System.out.println("Zdro: " + pasek(zdrowie));

            System.out.println("Szcz: " + szczescie);
        }
    }
    public static void main(String[] args){
        Ludek lu = new Ludek();
        lu.statystyki();
    }
}
