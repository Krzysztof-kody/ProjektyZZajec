package com.company.typyZmiennych;

public class CiagZnakow {
    public static void main(String[] args){
        // stworzenie zmiennej typu string i przypisanie jej wartości
        String ciag001 = "Jakieś zdanie do zapamiętania";

        // porównanie ciągów znaków
        String haslo = "tajneHaslo";
        if(haslo.equals("haslo")){
            System.out.println("OK");
        }
        else {
            System.out.println("to nie jest właściwe hasło >:/");
        }

        // pobranie konkretnej litery z ciągu
        String ciag002 = "abcdef";
        System.out.println("Litera kryjąca się pod indeksem 3 ciągu '" + ciag002 + "' to '" + ciag002.charAt(3) + "'");

        // sprawdzenie ile liter jest w ciągu znaków
        String ciag003 = "01234567";
        System.out.println("Ciąg '" + ciag003 +"' składa się z " + ciag003.length() + " liter");

        // sklejenie ciągów znaków
        String ciag004 = "0123";
        String ciag005 = "4567";
        ciag004 += ciag005;
        System.out.println("Ciąg po sklejeniu: " + ciag004);


    }
}
