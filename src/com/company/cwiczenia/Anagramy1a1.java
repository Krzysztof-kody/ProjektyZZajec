package com.company.cwiczenia;


import java.util.ArrayList;
import java.util.Arrays;

public class Anagramy1a1 {
    public static boolean anagramy(String s1, String s2){
        ArrayList<Integer> litery1 = new ArrayList<>(26);
        ArrayList<Integer> litery2 = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            litery1.add(0);
            litery2.add(0);
        }
        for(char l: s1.toCharArray()){
            litery1.set(l-'a',litery1.get(l-'a')+1);
        }
        for(char l: s2.toCharArray()){
            litery2.set(l-'a',litery2.get(l-'a')+1);
        }
        return litery1.equals(litery2);
    }

    public static boolean anagramy1(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        String wynik1 = new String(ss1);
        String wynik2 = new String(ss2);
        return wynik1.equals(wynik2);
    }
        public static void main(String[] args){
        System.out.println(anagramy1("abba", "bbaa"));
    }
}
