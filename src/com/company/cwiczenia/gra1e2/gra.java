package com.company.cwiczenia.gra1e2;

public class gra {

    public static void main(String[] args){
        Ludek lu = new Ludek("Czarek");
        int kasa = 20;
        Przedmiot apteczka = new Przedmiot("apteczka", 40, 0,0,0,0, 10);



        while(lu.uciekl==false){
            lu.statystyki();
            lu.setNajedzenie(20);
            if(lu.getZdrowie() < 50){
                if(kasa > apteczka.cena) {
                    apteczka.uzyj(lu);
                    System.out.println("uzyto apteczki");
                    kasa -= apteczka.cena;
                }
            }
            lu.stan();
        }

    }
}
