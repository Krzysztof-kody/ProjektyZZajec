package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Ksiazka> biblioteka = new ArrayList<Ksiazka>();
        biblioteka.add(new Ksiazka("Adam Mickiewicz", "Pan Tadeusz",200 , 1834,"bialo-czerwony"));
        biblioteka.add(new Ksiazka("Antygona","Sofokles",37, 400, "żółty"));
        biblioteka.add(new Ksiazka("Harry Potter","J.K. Rowling",437, 1997, "zielony"));

        int wybor = -1;
        Ksiazka ksiazkaTmp = new Ksiazka();

        while(wybor!=0){
            System.out.println("1. dodaj ksiazke");
            System.out.println("2. wypisz ksiegozbior");
            System.out.println("0. zakoncz program");
            System.out.print(":");
            wybor = sc.nextInt();
            switch (wybor){
                case 1:
                    System.out.println("---| DODAWANIE KSIAZKI |------------");
                    System.out.println("Tytul ksiazki: ");
                    ksiazkaTmp.setTytul(sc.nextLine());
                    System.out.println("Autor:  ");
                    ksiazkaTmp.setAutor(sc.nextLine());
                    System.out.println("Ilosc stron: ");
                    ksiazkaTmp.setIloscStron(sc.nextInt());
                    System.out.println("Rok wydania: ");
                    ksiazkaTmp.setRokWydania(sc.nextInt());
                    System.out.println("Kolor:  ");
                    ksiazkaTmp.setKolor(sc.next());
                    biblioteka.add(ksiazkaTmp);
                    break;
                case 2:
                    for(Ksiazka k: biblioteka){
                        k.fiszka();
                    }
                    break;
                case 0: break;
                default:
                    System.out.println("nie rozumien :(");
            }
        }

        /*      ArrayList<Uczen> uczniowie = new ArrayList<Uczen>();
        uczniowie.add(new Uczen("Jan", "Nowak", 1));
        uczniowie.get(0).informacjeOUczniu();
        uczniowie.get(0).setKlasa(2);
        System.out.println();
        uczniowie.get(0).informacjeOUczniu();
     /*   ArrayList<Zawodnik> klub = new ArrayList<>();
        klub.add(new Zawodnik("Jan", "Nowak", 22, "śpo", 10, 2, 1000, false));
*/
    }
}
