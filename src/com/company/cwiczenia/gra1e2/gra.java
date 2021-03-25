package com.company.cwiczenia.gra1e2;

public class gra {

    static class Ludek{
        int zdrowie;
        int szczescie;
        int zmeczenie;
        int czystosc;
        int najedzenie;

        String imie;
        public Ludek(String imie){
            zdrowie = 100;
            szczescie = 100;
            zmeczenie = 100;
            czystosc = 100;
            najedzenie = 60;
            this.imie = imie;
        }

        public String pasek(int n){
            String p = "";
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
            System.out.println("Zdro:  " + pasek(zdrowie));
            System.out.println("Szcz:  " + pasek(szczescie));
            System.out.println("Zmecz: " + pasek(zmeczenie));
            System.out.println("Czyst: " + pasek(czystosc));
            System.out.println("Najed: " + pasek(najedzenie));
        }

        public int getZdrowie() {
            return zdrowie;
        }

        public void setZdrowie(int zdrowie) {
            this.zdrowie += zdrowie;
        }

        public int getSzczescie() {
            return szczescie;
        }

        public void setSzczescie(int szczescie) {
            this.szczescie += szczescie;
            if(this.szczescie > 100){
                this.szczescie = 100;
                setZmeczenie(10);
                setZdrowie(5);
            }
        }

        public int getZmeczenie() {
            return zmeczenie;
        }

        public void setZmeczenie(int zmeczenie) {
            this.zmeczenie += zmeczenie;
            if(this.zmeczenie > 100){
                this.zmeczenie = 50;
                setSzczescie(-20);
                setZdrowie(-20);
                setCzystosc(-10);
            }
        }

        public int getCzystosc() {
            return czystosc;
        }

        public void setCzystosc(int czystosc) {
            this.czystosc += czystosc;
        }

        public int getNajedzenie() {
            return najedzenie;
        }

        public void setNajedzenie(int najedzenie) {
            this.najedzenie += najedzenie;
            if(this.najedzenie>100){
                System.out.println("PRZEKARMIENIE!!!");
                this.najedzenie = 100;
                setZdrowie(-10);
                setZmeczenie(10);
                setCzystosc(-10);
                setSzczescie(10);
            }
        }
    }
    public static void main(String[] args){
        Ludek lu = new Ludek("Czarek");
        lu.statystyki();
        lu.setNajedzenie(20);
        lu.statystyki();
        lu.setNajedzenie(20);
        lu.statystyki();
        lu.setNajedzenie(20);
        lu.statystyki();

    }
}
