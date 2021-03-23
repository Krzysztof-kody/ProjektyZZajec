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

            for(int i = 0; i < 20 - n/5; i++)
                p +=" ";

            p +="|";
            return p;
        }
        public void statystyki(){
            System.out.println("Zdrowie    " + pasek(zdrowie));
            System.out.println("Najedzenie " + pasek(sytosc));
        }

        public void nakarm(int n) {
            sytosc += n;
            if(sytosc > 100){
                sytosc = 100;
            }
        }
    }
    public static void main(String[] args){
        Stworek st = new Stworek("Kulek");
        st.statystyki();
        st.nakarm(30);
        st.statystyki();
    }
}
