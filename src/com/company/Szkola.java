package com.company;

import java.util.ArrayList;

public class Szkola {
    public static void main(String[] args) {

        ArrayList<Uczen> uczniowie = new ArrayList<>();

        uczniowie.add(new Uczen("Jan", "Nowak", 1));
        uczniowie.add(new Uczen("Janina", "Kowalska", 2));

      //  uczniowie.get(0).informacjeOUczniu();
      //  uczniowie.get(1).informacjeOUczniu();

        int wybor = -1;
        while (wybor != 0) {

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
