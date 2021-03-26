package com.company;

public class Palindrom1a1 {

    public static boolean czyPalindrom(String s1){
        String s2 = "";
        for(int i = s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static boolean czyPalindrom1(String s1) {

        for(int i = 0; i < s1.length()/2; i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    /*
        Wygeneruj 5K palindromów do pliku palindromy.txt.
        Palindromy mogą sładać się wyłącznie z małych liter alfabetu ang.
        Długość palindromów od 3 do 20

     */

        public static void main(String[] args){
        char[] litery = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i =0; i < 100; i++) {
            System.out.print( litery[(int)(Math.random() * litery.length)] + " ");
           }
        }


}
