package com.company.cwiczenia.gra1a2;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {

    public static void main(String[] args){
        Stworek tama = new Stworek("Stefan", "różowy");
        int kasa = 100;
        int wybor;
        Scanner sc = new Scanner(System.in);
        Przedmiot apteczka = new Przedmiot("apteczka", 50, 0,0,0, 50);
        Przedmiot pilka = new Przedmiot("pilka", 5,-10, -10,30, 10);
        Przedmiot kawa =  new Przedmiot("kawa",0,50, 0, 0, 20);


        while(tama.gramy == true){
            tama.statystyki();
            System.out.println("kasa: " + kasa);
            System.out.println("1. apteczka");
            System.out.println("2. pilka");
            System.out.println("3. kawa");
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
            }
            tama.podsumowanie();
        }

    }

}
