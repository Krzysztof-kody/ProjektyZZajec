package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Szkola {
    public static void main(String[] args) {

        ArrayList<Uczen> uczniowie = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        uczniowie.add(new Uczen("Jan", "Nowak", 1));
        uczniowie.add(new Uczen("Janina", "Kowalska", 2));

      //  uczniowie.get(0).informacjeOUczniu();
      //  uczniowie.get(1).informacjeOUczniu();


        int wybor = -1;
        while (wybor != 0) {

            System.out.println(" --| MENU |-------");
            System.out.println(" 1. wypisz informacje o uczniach");
            System.out.println("");
            System.out.println(" 0. zakoncz dzialanie aplikacji");


            wybor = sc.nextInt();
            switch (wybor) {
                case 1:
                    for (Uczen u : uczniowie) {
                        u.informacjeOUczniu();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nie znam takiej opcji");
            }
        }




    }}
