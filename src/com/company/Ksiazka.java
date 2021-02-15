package com.company;

import java.util.Scanner;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int iloscStron;
    private int rokWydania;
    private String kolor;
    private String wypozyczyl;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getWypozyczyl() {
        return wypozyczyl;
    }

    public void setWypozyczyl(String wypozyczyl) {
        this.wypozyczyl = wypozyczyl;
    }

    public void setIloscStron(int iloscStron) {
        if(iloscStron < 1)
            this.iloscStron = 0;
        else
            this.iloscStron = iloscStron;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void fiszka(){
        if(!getWypozyczyl().equals(""))
            System.out.print("**" + getWypozyczyl() + "** ");
        System.out.println(this.tytul + " \\ " + this.autor + " \\ " + this.iloscStron + " \\ " + this.rokWydania + " \\ " + this.kolor);
    }

    public Ksiazka(){
        setIloscStron(0);
        setAutor("");
        setTytul("");
        setRokWydania(0);
        setKolor(null);
        setWypozyczyl("");
    }

    /**
     *
     * @param tytul tytul ksiazki
     * @param autor
     * @param iloscStron
     * @param rokWydania
     * @param kolor
     */

    public Ksiazka(String tytul, String autor, int iloscStron, int rokWydania, String kolor){
        this.tytul = tytul;
        this.autor = autor;
        this.iloscStron = iloscStron;
        this.rokWydania = rokWydania;
        this.kolor = kolor;
        this.wypozyczyl = "";
    }

    public void wypozycz(){
        System.out.println("Komu wypozyczamy: ");
        Scanner sc = new Scanner(System.in);
        setWypozyczyl(sc.nextLine());
    }
    public void zwroc() {
       setWypozyczyl("");
    }
    }
