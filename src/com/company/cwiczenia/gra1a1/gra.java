package com.company.cwiczenia.gra1a1;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {

    static int loteria(int n, Stworek s, Przedmiot p){
        int wygrane = 0;
        for(int i =0; i< n; i++) {
            if (Math.random() < 0.2) {
                wygrane++;
                System.out.println("WYGRANA KASA!!!");
            }
            if (Math.random() < 0.2) {
                System.out.println("WYGRANY PRZEDMIOT!!! (" + p.nazwa + ")");
                p.ilosc++;
            }
        }
        return wygrane * 20;
    }

    public static void main(String[] args){

        Stworek tama = new Stworek("Stefan");

        int wybor = 0;
        Scanner sc = new Scanner(System.in);
        int kasa = 60;
        int tury = 0;
        int interwal = 2;

        Przedmiot apteczka = new Przedmiot("apteczka", 50, 0,0,0,0, 50);
        Przedmiot marchew = new Przedmiot("marchew", 5, 5,0,15,-5, 10);
        Przedmiot nocnik = new Przedmiot("nocnik", 0,0,0,0,100,20);

        Przedmiot praca = new Przedmiot("praca", 0,-20,0,-10,0,-20);

        tama.przywitajSie();

        while(tama.gramy) {
            tama.statystyki();
            if(tury % interwal == 0) {
                kasa += 20;
            }
            System.out.println("Kasa: " + kasa);
            System.out.println("1. apteczka (" + apteczka.ilosc + ")");
            System.out.println("2. marchew (" + marchew.ilosc + ")");
            System.out.println("8. loteria");
            System.out.println("9. idź do pracy");
            wybor = sc.nextInt();
            switch (wybor){
                case 1:
                    if(kasa >= apteczka.cena){
                        apteczka.uzyj(tama);
                        if(apteczka.ilosc == 0)
                            kasa -= apteczka.cena;
                        else
                            apteczka.ilosc--;
                    }else
                        System.out.println("Nie masz wystarczających środków");
                    break;
                case 2:
                    if(kasa >= marchew.cena){
                        marchew.uzyj(tama);
                        if(marchew.ilosc == 0)
                            kasa -= marchew.cena;
                        else
                            marchew.ilosc--;
                    }else
                        System.out.println("Nie masz wystarczających środków");
                    break;
                case 8:
                    System.out.println("Ile losów: ");
                    int losy = sc.nextInt();
                    if(kasa >= losy*10) {
                        kasa -= losy*10;
                        if (Math.random() < 0.5)
                            kasa += loteria(losy, tama, apteczka);
                        else
                            kasa += loteria(losy, tama, marchew);
                    }
                    break;
                case 9:
                    praca.uzyj(tama);
                    kasa -= praca.cena;
                    break;
            }
            tury++;
            tama.stan();
        }

    }

}
