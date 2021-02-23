package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Ksiazka> biblioteka = new ArrayList<Ksiazka>();

        File plik = new File("ksiazki.txt");
        Scanner in = new Scanner(plik);
        /*
        slowo (enter)
        slowo (enter)
        liczba (enter)
        liczba (enter)
        slowo (enter)
         */
        while (in.hasNext()){
            Ksiazka tmp = new Ksiazka(); // <---
            tmp.setTytul(in.nextLine());
            tmp.setAutor(in.nextLine());
            tmp.setIloscStron(in.nextInt());
            tmp.setRokWydania(in.nextInt());
            in.nextLine();
            tmp.setKolor(in.nextLine());
            biblioteka.add(tmp);
        }

        int wybor = -1;

        while(wybor!=0){
            Ksiazka ksiazkaTmp = new Ksiazka();
            System.out.println("1. dodaj ksiazke");
            System.out.println("2. wypisz ksiegozbior");
            System.out.println("3. policz ksiegozbior");
            System.out.println("4. szukaj ksiazki po roku");

            System.out.println("5. szukaj ksiazki po tytule");
            System.out.println("6. szukaj ksiazki po autorze");

            System.out.println("0. zakoncz program");
            System.out.print(":");
            wybor = sc.nextInt();
            sc.nextLine();

            switch (wybor){
                case 1:

                    FileWriter fw = new FileWriter("ksiazki.txt", true); //ustawienie true by dodawać do pliku
                    PrintWriter out = new PrintWriter(fw);

                    System.out.println("---| DODAWANIE KSIAZKI |------------");
                    System.out.println("Tytul ksiazki: ");
                    ksiazkaTmp.setTytul(sc.nextLine());
                    out.println(ksiazkaTmp.getTytul());
                    System.out.println("Autor:  ");
                    ksiazkaTmp.setAutor(sc.nextLine());
                    out.println(ksiazkaTmp.getAutor());
                    System.out.println("Ilosc stron: ");
                    ksiazkaTmp.setIloscStron(sc.nextInt());
                    out.println(ksiazkaTmp.getIloscStron());
                    System.out.println("Rok wydania: ");
                    ksiazkaTmp.setRokWydania(sc.nextInt());
                    out.println(ksiazkaTmp.getRokWydania());
                    sc.nextLine();
                    System.out.println("Kolor:  ");
                    ksiazkaTmp.setKolor(sc.nextLine());
                    out.println(ksiazkaTmp.getKolor());
                    biblioteka.add(ksiazkaTmp);
                    out.close();
                    break;
                case 2:
                    for(Ksiazka k: biblioteka){
                        k.fiszka();
                    }
                    break;
                case 3:
                    System.out.println("Mamy: " + biblioteka.size() + " ksiażki/książek");
                    System.out.println();
                    break;
                case 4:
                    int rok;
                    System.out.println("Podaj szukany rok: ");
                    rok = sc.nextInt();
                    sc.nextLine();
                    for(Ksiazka k: biblioteka){
                        if(k.getRokWydania() == rok){
                            k.fiszka();
                        }
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
