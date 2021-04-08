package com.company.cwiczenia.gra1e2;

import java.util.Scanner;

public class gra {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ludek lu = new Ludek("Czarek");
        int kasa = 20;
        Przedmiot apteczka = new Przedmiot("apteczka", 40, 0,0,0,0, 10);
        Przedmiot marchewka = new Przedmiot("marchewka", 5, 0,0,-5,10, 5);


        int wybor;
        while(lu.uciekl==false){
            lu.statystyki();
            System.out.println();
            System.out.println("1. apteczka");
            System.out.println("2. marchewka");
            System.out.print("Wybierz: ");
            wybor = sc.nextInt();
            switch(wybor){
                case 1:
                    if(kasa >= apteczka.cena) {
                        apteczka.uzyj(lu);
                        System.out.println("uzyto apteczki");
                        kasa -= apteczka.cena;
                    }else {
                        System.out.println("Masz za mało pieniedzy");
                    }
                    break;
                case 2:
                    if(kasa >= marchewka.cena) {
                        marchewka.uzyj(lu);
                        System.out.println("uzyto marchewki");
                        kasa -= marchewka.cena;
                    }else {
                        System.out.println("Masz za mało pieniedzy");
                    }
                    break;
            }
            lu.stan();
        }

    }
}
