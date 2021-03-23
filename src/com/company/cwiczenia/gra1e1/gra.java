package com.company.cwiczenia.gra1e1;

public class gra {

    static class Stworek{
        int zdrowie;
        int sytosc;
        String imie;
        public Stworek(String imie){
            this.imie = imie;
            zdrowie = 20;
            sytosc = 100;
        }

        public String pasek(int n){

            String p = "";

            p += "|";
            for(int i = 0; i < n/5; i++)
                p += "#";

            for(int i = 0; i < 20 - zdrowie/5; i++)
                System.out.print(" ");

            System.out.print("|");
            return p;
        }
        public void statystyki(){
            System.out.println("Zdrowie    " + zdrowie);
            System.out.println("Najedzenie " + sytosc);
        }

    }
    public static void main(String[] args){
        Stworek st = new Stworek("Kulek");
        st.statystyki();
    }
}
