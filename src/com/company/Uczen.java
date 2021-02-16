package com.company;

import java.util.ArrayList;

public class Uczen {

    private String imie;
    private String nazwisko;
    private int klasa;
    private String ulubionyPrzedmiot;
    public static int test;

    public Uczen(){ }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public ArrayList<String> getUwagi() {
        return uwagi;
    }

    public void setUwagi(ArrayList<String> uwagi) {
        this.uwagi = uwagi;
    }

    private ArrayList<String> uwagi = new ArrayList<String>();

    public Uczen(String imie, String nazwisko, int klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        setKlasa(klasa);
    }

    public void informacjeOUczniu(){
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Klasa: " + this.klasa);
        System.out.print("Ulubiony przedmiot: ");
        if(this.ulubionyPrzedmiot == null){
            System.out.println("---");
        }else {
            System.out.println(this.ulubionyPrzedmiot);
        }
        System.out.println("Ilość uwag: " + uwagi.size());
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        if(klasa>0 && klasa <=4) {
            this.klasa = klasa;
        }
        else{
            System.out.println("err");
        }
    }

    public String getUlubionyPrzedmiot() {
        return ulubionyPrzedmiot;
    }

    public void setUlubionyPrzedmiot(String ulubionyPrzedmiot) {
        this.ulubionyPrzedmiot = ulubionyPrzedmiot;
    }
}
