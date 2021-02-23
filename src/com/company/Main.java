package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void ladowaniePierwszejKsiazki() throws FileNotFoundException {
        File p = new File("ksiazki.txt");
        Scanner sc = new Scanner(p);
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        sc.nextLine();
        System.out.println(sc.nextLine());
    }

    public static void loadBiblio(ArrayList<Ksiazka> biblio) throws FileNotFoundException {
        biblio.clear();
        File plik = new File("ksiazki.txt");
        Scanner in = new Scanner(plik);
        while (in.hasNext()){
            Ksiazka tmp = new Ksiazka(); // <---
            tmp.setTytul(in.nextLine());
            tmp.setAutor(in.nextLine());
            tmp.setIloscStron(in.nextInt());
            tmp.setRokWydania(in.nextInt());
            in.nextLine();
            tmp.setKolor(in.nextLine());
            biblio.add(tmp);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Ksiazka> biblioteka = new ArrayList<>();
        loadBiblio(biblioteka);
      //  ladowaniePierwszejKsiazki();
        int wybor = -1;

        while(wybor!=0){
            Ksiazka ksiazkaTmp = new Ksiazka();
            System.out.println("1. dodaj ksiazke");
            System.out.println("2. wypisz ksiegozbior");
            System.out.println("3. policz ksiegozbior");
            System.out.println("4. szukaj ksiazki po roku");

            System.out.println("5. szukaj ksiazki po tytule");
            System.out.println("6. szukaj ksiazki po autorze");

            System.out.println("7. usuń książkę");

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
                    out.println(sc.nextLine());
                    System.out.println("Autor:  ");
                    out.println(sc.nextLine());
                    System.out.println("Ilosc stron: ");
                    out.println(sc.nextInt());
                    System.out.println("Rok wydania: ");
                    out.println(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Kolor:  ");
                    out.println(sc.nextLine());
                    out.close();
                    loadBiblio(biblioteka);
                    break;
                case 2:
                    int i = 0;
                    for(Ksiazka k: biblioteka){
                        System.out.print(i + ". ");
                        i++;
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

                case 7:
                    System.out.println("!!! USUWANIE !!!");
                    System.out.println("Podaj nr ksiąki do usunięcia: ");
                    int ksiazka = sc.nextInt();
                    sc.nextLine();
                    biblioteka.remove(ksiazka);
                    PrintWriter outP = new PrintWriter("ksiazki.txt");
                    // for(licznik; warunek; zmiana){}
                    // for(element: zbior){ element}
                    for (Ksiazka k: biblioteka){
                        outP.println(k.getTytul());
                        outP.println(k.getAutor());
                        outP.println(k.getIloscStron());
                        outP.println(k.getRokWydania());
                        outP.println(k.getKolor());
                    }
                    outP.close();
                    loadBiblio(biblioteka);
                    break;
                case 0: break;
                default:
                    System.out.println("nie rozumien :(");
            }
        }

    }
}
