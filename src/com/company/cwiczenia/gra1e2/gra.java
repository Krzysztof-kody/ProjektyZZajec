package com.company.cwiczenia.gra1e2;

import java.util.Scanner;

public class gra {

    static int loteria(int n, Ludek lu){
        int wygrane = 0;
        for(int i = 0; i < n; i++) {
            if (Math.random() <= 0.2) {
                wygrane++;
                System.out.println("WYGRANA!!!");
                lu.setSzczescie(10);
            }
        }
        return wygrane * 20;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ludek lu = new Ludek("Czarek");
        int kasa = 20;
        int tury = 0;
        int interwal = 7;

        Przedmiot apteczka = new Przedmiot("apteczka", 40, 0,0,0,0, 10);
        Przedmiot marchewka = new Przedmiot("marchewka", 5, 0,0,-5,10, 5);
        Przedmiot praca = new Przedmiot("praca", 0, 0,15,-5,-5, -15);

        int losy;
        int wybor;
        while(lu.uciekl==false){
            lu.statystyki();
            tury++;
            if(tury % interwal == 0) kasa += 10;
            System.out.println("Kasa: " + kasa);
            System.out.println();
            System.out.println("1. apteczka");
            System.out.println("2. marchewka");
            System.out.println("8. kup losy");
            System.out.println("9. idź do pracy");
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
                case 8:
                    System.out.println("ile? (koszt: 10)");
                    losy = sc.nextInt();
                    if(kasa >= losy *10){
                        kasa -= losy * 10;
                        kasa += loteria(losy, lu);
                    }
                    break;
                case 9:
                    praca.uzyj(lu);
                    System.out.println("Kolejny dzień w pracy");
                    kasa -= praca.cena;
                    break;
            }
            lu.stan();
        }

    }
}
