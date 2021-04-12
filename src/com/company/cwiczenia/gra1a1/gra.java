package com.company.cwiczenia.gra1a1;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {


    public static void main(String[] args){

        Stworek tama = new Stworek("Stefan");

        int wybor = 0;
        Scanner sc = new Scanner(System.in);
        int kasa = 60;

        Przedmiot apteczka = new Przedmiot("apteczka", 50, 0,0,0,0, 50);
        Przedmiot marchew = new Przedmiot("marchew", 5, 5,0,15,-5, 10);
        Przedmiot nocnik = new Przedmiot("nocnik", 0,0,0,0,100,20);
        tama.przywitajSie();

        while(tama.gramy) {
            tama.statystyki();
            System.out.println("1. apteczka");
            System.out.println("2. marchew");
            wybor = sc.nextInt();
            switch (wybor){
                case 1:
                    if(kasa >= apteczka.cena){
                        apteczka.uzyj(tama);
                        kasa -= apteczka.cena;
                    }else
                        System.out.println("Nie masz wystarczających środków");
                    break;
                case 2:
                    if(kasa >= marchew.cena){
                        marchew.uzyj(tama);
                        kasa -= marchew.cena;
                    }else
                        System.out.println("Nie masz wystarczających środków");
                    break;
            }
            tama.stan();
        }

    }

}
