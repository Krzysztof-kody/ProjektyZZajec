package com.company.cwiczenia.gra1e1;

import java.util.ArrayList;
import java.util.Scanner;

public class gra {


    public static void main(String[] args){
        Stworek st = new Stworek("Kulek");
        Scanner sc = new Scanner(System.in);
        int kasa = 60;
        int wybor;
        Przedmiot apteczka = new Przedmiot("apteczka",50,0,0,0, 50);
        Przedmiot pilka = new Przedmiot("pilka", 0,0,0,30, 10);
        Przedmiot marchewka = new Przedmiot("marchewka", 5,15,10,0, 5);

        while(st.zywy) {
            st.statystyki();
            System.out.println();
            System.out.println("1. apteczka");
            System.out.println("2. pilka");
            System.out.println("3. marchewka");
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
            }

        }
    }
}
