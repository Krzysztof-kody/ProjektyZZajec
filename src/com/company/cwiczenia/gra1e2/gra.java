package com.company.cwiczenia.gra1e2;

public class gra {

    static class Ludek{
        int zdrowie;
        int szczescie;
        int zmeczenie;
        int czystosc;
        int najedzenie;
        boolean uciekl;

        String imie;
        public Ludek(String imie){
            uciekl = false;
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
            if(this.zdrowie > 100){
                this.zdrowie = 100;
            }
            if(this.zdrowie < 0){
                this.zdrowie = 0;
                this.uciekl = true;
            }
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
            if(this.szczescie <= 0){
                this.szczescie = 0;
                uciekl = true;
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
            if(this.zmeczenie < 0){
                this.zmeczenie = 0;
                setSzczescie(10);
                setZdrowie(10);
            }
        }

        public int getCzystosc() {
            return czystosc;
        }

        public void setCzystosc(int czystosc) {
            this.czystosc += czystosc;
            if(this.czystosc > 100){
                this.czystosc = 100;
            }
            if(this.czystosc < 0) {
                this.czystosc = 0;
                setZdrowie(-10);
                setSzczescie(-10);
            }
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
            if(this.najedzenie < 0){
                this.najedzenie = 0;
                setZdrowie(-10);
                setSzczescie(-10);
                setZmeczenie(-10);
            }
        }
        public void stan(){
            if(this.zdrowie == 0){
                uciekl = true;
                System.out.println("Twoj stworek podupadł na zdrowiu i odszedł");
            }
            if(this.szczescie == 0){
                uciekl = true;
                System.out.println("Twoj stworek był zbyt przygnębiony i uciekł");
            }
            if(this.zmeczenie == 0){
                System.out.println("Twoj stworek stracił przytomność");
            }
            if(this.czystosc == 0){
                System.out.println("Żyje w brudzie!");
            }
            if(this.najedzenie == 0){
                System.out.println("Twoj stworek głoduje");
            }

        }
    }
    public static void main(String[] args){
        Ludek lu = new Ludek("Czarek");
        while(lu.uciekl==false){
            lu.statystyki();
            lu.setNajedzenie(20);
            lu.stan();
        }
        Przedmiot apteczka = new Przedmiot("apteczka", 40, 0,0,0,0, 10);
    }
}
