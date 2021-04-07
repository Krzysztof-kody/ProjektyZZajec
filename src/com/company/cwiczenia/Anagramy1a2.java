package com.company.cwiczenia;

import java.util.Arrays;

public class Anagramy1a2 {

    static boolean czyAnagramy(String s1, String s2){
        int[] litery = new int[26];
        int[] litery2 = new int[26];

        for(int i = 0 ; i < s1.length(); i++){
            litery[s1.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < s2.length(); i++){
            litery2[s2.charAt(i)-97]++;
        }

        for (int i = 0; i <litery.length; i++){
            if(litery[i] != litery2[i]){
                return false;
            }
        }
        return true;
    }
/*
    ababa
    babaa

    aaabb
    aaabb


 */


    public static void main(String[] args){
        String s1 = "aaasxsxsddd";
        String s2 = "xxsaaassddd";

        char[] slowo1 = s1.toCharArray();
        char[] slowo2 = s2.toCharArray();
        Arrays.sort(slowo1);
        Arrays.sort(slowo2);

        String w1 = new String(slowo1);
        String w2 = new String(slowo2);

        System.out.println(w1);
        System.out.println(w2);

        if(w1.equals(w2)){
            System.out.println("ok");
        }else System.out.println("ee");

    }
}
