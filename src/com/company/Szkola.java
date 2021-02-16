package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Szkola {
    public static void main(String[] args) {

        ArrayList<Uczen> uczniowie = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int wybor = -1;
        int klasa = 0;
        String txt;
        uczniowie.add(new Uczen("Jan", "Nowak", 1));
        uczniowie.add(new Uczen("Janina", "Kowalska", 2));

      //  uczniowie.get(0).informacjeOUczniu();
      //  uczniowie.get(1).informacjeOUczniu();



        while (wybor != 0) {

            System.out.println(" --| MENU |-------");
            System.out.println(" 1. wypisz informacje o uczniach");
            System.out.println(" 2. wyswietl oddział");
            System.out.println(" 3. wyszukaj uczniow po imieniu");

            System.out.println("");
            System.out.println(" 0. zakoncz dzialanie aplikacji");


            wybor = sc.nextInt();
            switch (wybor) {
                case 1:
                    for (Uczen u : uczniowie) {
                        u.informacjeOUczniu();
                    }
                    break;
                case 2:
                    System.out.println("Klasa: ");
                    klasa = sc.nextInt();
                    for (Uczen u : uczniowie) {
                        if(u.getKlasa() == klasa)
                            u.informacjeOUczniu();
                    }
                    break;
                case 3:
                    System.out.println("Podaj imię: ");
                    txt = sc.nextLine();
                    for (Uczen u : uczniowie) {
                        if(u.getImie().equals(txt))
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
