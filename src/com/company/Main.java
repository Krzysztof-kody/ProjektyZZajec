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
            System.out.println("8. edytuj dane książki");
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
                case 5:
                    System.out.print("Podaj tytuł książki: ");
                    String szukajT = sc.nextLine();
                    /*
                    for (int j = 0; j < biblioteka.size(); j++) {
                        if(biblioteka.get(j).getTytul().equals(szukajT)){
                            System.out.print(j + ". ");
                            biblioteka.get(j).fiszka();
                        }
                    }
                     */
                    int j = 0;
                    for (Ksiazka k: biblioteka) {
                        if(k.getTytul().equals(szukajT)){
                            System.out.print(j + ". ");
                            k.fiszka();
                        }
                        j++;
                    }

                    break;
                case 6:
                    System.out.print("Podaj tytuł autora: ");
                    String szukajA = sc.nextLine();
                    for (int jj = 0; jj < biblioteka.size(); jj++) {
                        if(biblioteka.get(jj).getAutor().equals(szukajA)){
                            System.out.print(jj + ". ");
                            biblioteka.get(jj).fiszka();
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
                case 8:
                    System.out.println("--| Edycja danych |----");
                    System.out.println("Podaj nr ksiazki: ");
                    int k = sc.nextInt();
                    sc.nextLine();
                    System.out.println("a. zmień tytuł (" + biblioteka.get(k).getTytul() + ")");
                    System.out.println("b. zmień autora (" + biblioteka.get(k).getAutor() + ")");
                    System.out.println("c. zmień datę (" + biblioteka.get(k).getRokWydania() + ")");
                    System.out.println("d. zmień ilość stron (" + biblioteka.get(k).getIloscStron() + ")");
                    System.out.println("e. zmień kolor (" + biblioteka.get(k).getKolor() + ")");

                    System.out.println("x. rezygnuj z edycji");
                    System.out.print(": ");
                    String znak = sc.nextLine();

                    switch (znak){
                        case "a":
                            biblioteka.get(k).setTytul(sc.nextLine());
                            break;
                        case "b":
                            biblioteka.get(k).setAutor( sc.nextLine());
                            break;
                        case "c":
                            biblioteka.get(k).setRokWydania( sc.nextInt());
                            sc.nextLine();
                            break;
                        case "d":
                            biblioteka.get(k).setIloscStron(sc.nextInt());
                            sc.nextLine();
                            break;
                        case "e":
                            biblioteka.get(k).setKolor(sc.nextLine());
                            break;
                        case "x":
                            break;
                        default:
                            System.out.println("Nie mam takiej opcji");
                            break;
                    }
                    PrintWriter outE = new PrintWriter("ksiazki.txt");
                    for (Ksiazka kE: biblioteka){
                        outE.println(kE.getTytul());
                        outE.println(kE.getAutor());
                        outE.println(kE.getIloscStron());
                        outE.println(kE.getRokWydania());
                        outE.println(kE.getKolor());
                    }
                    outE.close();
                    break;
                case 0: break;
                default:
                    System.out.println("nie rozumiem :(");
            }
        }

    }
}
