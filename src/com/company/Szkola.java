package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Szkola {
    public static void main(String[] args) throws IOException {
       ArrayList<Uczen> uczniowie = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int wybor = -1;
        int klasa = 0;
        String txt;
        String tmpImie;
        String tmpNazwisko;
        int tmpKlasa;

        File nazwa = new File("uczniowie.txt");
        Scanner in = new Scanner(nazwa);

        while(in.hasNext()){
            tmpImie = in.nextLine();
            tmpNazwisko = in.nextLine();
            tmpKlasa = in.nextInt();
            uczniowie.add(new Uczen(tmpImie,tmpNazwisko,tmpKlasa));
            if(in.hasNext()) in.nextLine();
        }

        while (wybor != 0) {

            System.out.println(" --| MENU |-------");
            System.out.println(" 1. wypisz informacje o uczniach");
            System.out.println(" 2. wyswietl oddział");
            System.out.println(" 3. wyszukaj uczniow po imieniu");
            System.out.println(" 4. wpisz ucznia");
            System.out.println(" 5. usuń ucznia");

            System.out.println("");
            System.out.println(" 0. zakoncz dzialanie aplikacji");

            wybor = sc.nextInt();
            sc.nextLine();
            switch (wybor) {
                case 1:

                    for(int i = 0; i < uczniowie.size(); i++){
                        System.out.print( i + ". ");
                        uczniowie.get(i).informacjeOUczniu();
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
                    tmpImie = sc.nextLine();
                    System.out.print("Imie: ");
                    tmpNazwisko = sc.nextLine();
                    System.out.print("Klasa: ");
                    tmpKlasa = sc.nextInt();
                    sc.nextLine();
                    FileWriter fw = new FileWriter("uczniowie.txt", true); //ustawienie true by dodawać do pliku
                    PrintWriter out = new PrintWriter(fw);
                    out.println(tmpImie + "\n" + tmpNazwisko + "\n" + tmpKlasa);
                    out.close();
                    uczniowie.add(new Uczen(tmpImie, tmpNazwisko, tmpKlasa));
                    break;
                case 5:
                    System.out.println("Podaj ineks ucznia: ");
                    uczniowie.remove(sc.nextInt());
                    PrintWriter out1 = new PrintWriter("uczniowie.txt");
                    for (Uczen u: uczniowie) {
                        out1.println(u.getImie() + "\n" + u.getNazwisko() + "\n" + u.getKlasa());
                    }
                    out1.close();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nie znam takiej opcji");
            }
        }




    }}
