package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class KlubSportowy {

    public static void main(String[] args) throws IOException {

        ArrayList<Zawodnik> druzynaPilkarska = new ArrayList<>();

        File file = new File("zespol.txt");
        Scanner in = new Scanner(file);

        while(in.hasNext()) {
            Zawodnik tmp = new Zawodnik();
            tmp.setImie(in.nextLine());
            tmp.setNazwisko(in.nextLine());
            tmp.setWiek(in.nextInt());
            in.nextLine();
            tmp.setPozycja(in.nextLine());
            tmp.setIloscGoli(in.nextInt());
            tmp.setNr(in.nextInt());
            tmp.setWartoscKontraktu(in.nextInt());
            if(in.hasNext())
                in.nextLine();
            druzynaPilkarska.add(tmp);
        }


        int wybor = -1;
        Scanner sc = new Scanner(System.in);

        while(wybor!=0){
            System.out.println("---| MENU |------------");
            System.out.println("1. wyswietl zawodnikow");
            System.out.println("2. dodaj zawodnika");
            System.out.println("3. szukaj zawodnika po nr");
            System.out.println("4. usun zawodnika");

            System.out.println();
            System.out.println("0. zakoncz program");
            wybor = sc.nextInt();
            sc.nextLine();
            switch (wybor){
                case 1:
                    for (Zawodnik z: druzynaPilkarska){
                        z.statystyka();
                    }
                    break;

                case 2:
                    Zawodnik tmpZawodnik = new Zawodnik();
                    System.out.println("  -| dodawanie zawodnika |- ");
                    System.out.print("Nazwisko: ");
                    tmpZawodnik.setNazwisko(sc.nextLine());
                    System.out.print("Imie: ");
                    tmpZawodnik.setImie(sc.nextLine());
                    System.out.print("wiek: ");
                    tmpZawodnik.setWiek(sc.nextInt());
                    sc.nextLine();
                    System.out.print("pozycja: ");
                    tmpZawodnik.setPozycja(sc.nextLine());
                    System.out.print("ilosc goli: ");
                    tmpZawodnik.setIloscGoli(sc.nextInt());
                    System.out.print("wartosc kontraktu: ");
                    tmpZawodnik.setWartoscKontraktu(sc.nextInt());
                    System.out.print("nr: ");
                    tmpZawodnik.setNr(sc.nextInt());
                    sc.nextLine();
                    tmpZawodnik.setKontuzja(false);
                    druzynaPilkarska.add(tmpZawodnik);
                    FileWriter fw = new FileWriter("zespol.txt", true); //ustawienie true by dodawać do pliku
                    PrintWriter out = new PrintWriter(fw);
                    out.println(tmpZawodnik.getImie() + "\n" + tmpZawodnik.getNazwisko() + "\n" + tmpZawodnik.getWiek() + "\n" + tmpZawodnik.getPozycja() + " \n" + tmpZawodnik.getIloscGoli() + "\n" + tmpZawodnik.getNr() + "\n" + tmpZawodnik.getWartoscKontraktu());
                    out.close();
                    break;
                case 3:
                    System.out.print("Podaj nr zawodnika: ");
                    int nr = sc.nextInt();
                    sc.nextLine();
                    int id = 0;
                    for(Zawodnik z: druzynaPilkarska){
                        if(z.getNr() == nr){
                            z.statystyka();
                            break;
                        }
                        id++;
                    }
                    if(id < druzynaPilkarska.size()) {
                        System.out.println(id);
                    }
                    else{
                        System.out.println("Nie mamy takiego zawodnika");
                    }
                    break;
                case 4:
                    System.out.print("Podaj nr zawodnika: ");
                    int nrU = sc.nextInt();
                    sc.nextLine();
                    int idU = 0;
                    for(Zawodnik z: druzynaPilkarska){
                        if(z.getNr() == nrU){
                            break;
                        }
                        idU++;
                    }
                    if(idU < druzynaPilkarska.size()) {
                        druzynaPilkarska.remove(idU); // <---
                        PrintWriter outU = new PrintWriter("zespol.txt");
                        for(Zawodnik z: druzynaPilkarska) {
                            outU.println(z.getImie() + "\n" + z.getNazwisko() + "\n" + z.getWiek() + "\n" + z.getPozycja() + " \n" + z.getIloscGoli() + "\n" + z.getNr() + "\n" + z.getWartoscKontraktu());
                        }
                        outU.close();
                    }
                    else{
                        System.out.println("Nie mamy takiego zawodnika");
                    }
                case 0: break;
                default:
                    System.out.println("Nie mam takiej opcji na liście");
            }
        }


    }
}
