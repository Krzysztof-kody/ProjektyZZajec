package com.company.cwiczenia.gra1e1;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {

    static int loteria(int n, Stworek s){
        int wygrane = 0;
        for(int i =0; i < n; i++){
            if(Math.random() <= 0.2){
                System.out.println("WYGRANA!!!");
                wygrane++;
                s.setZabawa(5);
            }else
            {
                s.setZabawa(-5);
            }
        }
        return wygrane * 20;
    }

    public static void main(String[] args){
        Stworek st = new Stworek("Kulek");
        Scanner sc = new Scanner(System.in);
        int kasa = 60;
        int wybor;
        int tura = 0;
        int interwal = 3;
        Przedmiot apteczka = new Przedmiot("apteczka",50,0,0,0, 50);
        Przedmiot pilka = new Przedmiot("pilka", 0,0,0,30, 10);
        Przedmiot marchewka = new Przedmiot("marchewka", 5,15,10,0, 5);
        Przedmiot praca = new Przedmiot("praca", -10, -10, 10, -10, -20 );

        while(st.zywy) {
            st.statystyki();
            if(tura % interwal == 0){
                apteczka.ilosc++;
                pilka.ilosc += 2;
                marchewka.ilosc++;
            }
            System.out.println();
            System.out.println("Kasa: " + kasa);
            System.out.println("1. apteczka (" + apteczka.ilosc +  ")");
            System.out.println("2. pilka (" + pilka.ilosc +")");
            System.out.println("3. marchewka (" + marchewka.ilosc + ")");
            System.out.println("8. loteria");
            System.out.println("9. Idź pracoać");
            System.out.print("Wybierz: ");
            wybor = sc.nextInt();

            switch (wybor) {
                case 1:
                    if (apteczka.ilosc > 0) {
                        if (kasa >= apteczka.cena) {
                            System.out.println("Uzyto apteczki");
                            apteczka.uzyj(st);
                            kasa -= apteczka.cena;
                        }
                    }
                    break;
                case 2:
                    if (pilka.ilosc > 0) {
                        if (kasa >= pilka.cena) {
                            System.out.println("Uzyto pilka");
                            pilka.uzyj(st);
                            kasa -= pilka.cena;
                        }
                    }
                    break;
                case 3:
                    if (marchewka.ilosc > 0) {
                        if (kasa >= marchewka.cena) {
                            System.out.println("Uzyto marchewka");
                            marchewka.uzyj(st);
                            kasa -= marchewka.cena;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Ile losow: ");
                    int losy = sc.nextInt();
                    if(kasa >= losy * 10){
                        kasa -= losy * 10;
                        kasa += loteria(losy, st);
                    }


                    break;
                case 9:
                    praca.uzyj(st);
                    kasa -= praca.cena;
                    break;
            }
            tura++;
        }
    }
}
