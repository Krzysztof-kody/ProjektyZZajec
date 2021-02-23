package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Szkola {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Uczen> uczniowie = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int wybor = -1;
        int klasa = 0;
        String txt;
        String s1zPliku;
        String s2zPliku;
        int zPlikuI;

        File nazwa = new File("uczniowie.txt");
        Scanner in = new Scanner(nazwa);

        while(in.hasNext()){
            s1zPliku = in.nextLine();
            s2zPliku = in.nextLine();
            zPlikuI = in.nextInt();
            uczniowie.add(new Uczen(s1zPliku,s2zPliku,zPlikuI));
            if(in.hasNext()) in.nextLine();
        }


        while (wybor != 0) {

            System.out.println(" --| MENU |-------");
            System.out.println(" 1. wypisz informacje o uczniach");
            System.out.println(" 2. wyswietl oddział");
            System.out.println(" 3. wyszukaj uczniow po imieniu");
            System.out.println(" 4. wpisz ucznia");

            System.out.println("");
            System.out.println(" 0. zakoncz dzialanie aplikacji");


            wybor = sc.nextInt();
            sc.nextLine();
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
                case 4:
                    System.out.println("--| DODAWANIE UCZNIA |-------");
                    System.out.print("Nazwisko: ");
                    sc.nextLine();
                    System.out.print("Imie: ");
                    sc.nextLine();
                    System.out.print("Klasa: ");
                    sc.nextInt();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Nie znam takiej opcji");
            }
        }




    }}
