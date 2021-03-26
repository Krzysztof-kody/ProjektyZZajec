package com.company;

public class Palindrom1a2 {


    public static boolean czyPalindrom1(String s){
        String s2 = "";
        for (int i = 1; i <= s.length(); i++){
            s2 += s.charAt(s.length()-i);
        }
        return s2.equals(s);

    }
    public static boolean czyPalindrom2(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
/*

        Wygeneruj 5K palindromów do pliku palindromy.txt
        Palindromy mogą sładać się wyłącznie z małych liter alfabetu ang.
        Długość palindromów od 3 do 20
        dopuścić powstawanie nieparzystej ilości ciągów

 */
    public static void main(String[] args){

        char[] litery = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i=0; i< 15; i++) {
            System.out.print(litery[(int) (Math.random() * litery.length)]);
        }
    }
}
