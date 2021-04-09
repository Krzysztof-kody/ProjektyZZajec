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

    static boolean czyAnagramy2(String s1, String s2) {
        char[] slowo1 = s1.toCharArray();
        char[] slowo2 = s2.toCharArray();
        Arrays.sort(slowo1);
        Arrays.sort(slowo2);
        String w1 = new String(slowo1);
        String w2 = new String(slowo2);
        return w1.equals(w2);
        }


        public static void main(String[] args){
        String s1 = "aaasxsxsddd";
        String s2 = "xssaaassddd";
        if(czyAnagramy2(s1,s2)){
            System.out.println("ok");
        }else System.out.println("ee");
    }
}
