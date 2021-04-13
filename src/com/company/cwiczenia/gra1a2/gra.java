package com.company.cwiczenia.gra1a2;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {

    static int loteria(int n, int cena, int wygrana, int kasa, Stworek s){
        int wygrane = 0;
        if(kasa >= n*cena) {
            for(int i = 0; i < n; i++) {
                if (Math.random() <= 0.2) {
                    wygrane++;
                    System.out.println("Wygrana!!!!");
                    s.setNastroj(10);
                } else {
                    s.setNastroj(-5);
                }
            }
        }
        else{
            return -1;
        }
        return wygrane * wygrana;

    }
    public static void main(String[] args){
        Stworek tama = new Stworek("Stefan", "różowy");
        int kasa = 100;
        int wybor;
        int tury = 0;
        int interwal = 7;
        Scanner sc = new Scanner(System.in);

        Przedmiot apteczka = new Przedmiot("apteczka", 50, 0,0,0, 50);
        Przedmiot pilka = new Przedmiot("pilka", 5,-10, -10,30, 10);
        Przedmiot kawa =  new Przedmiot("kawa",0,50, 0, 0, 20);
        Przedmiot praca =  new Przedmiot("praca",-5,-20, -10, 0, -20);


        while(tama.gramy == true){
            tama.statystyki();
            if(tury % interwal == 0) kasa += 20;
            System.out.println("tura: " + tury + " kasa: " + kasa);
            System.out.println("1. apteczka");
            System.out.println("2. pilka");
            System.out.println("3. kawa");
            System.out.println("8. loteria");

            System.out.println("9. idź do pracy");

            wybor = sc.nextInt();
            switch(wybor){
                case 1:
                    if(kasa >= apteczka.cena){
                        apteczka.uzyj(tama);
                        kasa -= apteczka.cena;
                    }
                    break;
                case 2:
                    if(kasa >= pilka.cena){
                        pilka.uzyj(tama);
                        kasa -= pilka.cena;
                    }
                    break;
                case 3:
                    if(kasa >= kawa.cena){
                        kawa.uzyj(tama);
                        kasa -= kawa.cena;
                    }break;
                case 8:
                    System.out.println("Ile losów: ");
                    int losy = sc.nextInt();
                    int tmp = loteria(losy,10,20,kasa,tama);
                    if( tmp >=0){
                        kasa -= losy*10;
                        kasa += tmp;
                    }
                    else{
                        System.out.println("brak środków na zakup losów");
                    }

                    break;
                case 9:
                    praca.uzyj(tama);
                    kasa -= praca.cena;
                    break;
            }
            tury++;
            tama.podsumowanie();
        }
    }
}
