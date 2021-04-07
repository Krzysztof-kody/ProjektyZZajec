package com.company.cwiczenia;

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

    public static void main(String[] args){
        String s1 = "aaasxsxsddd";
        String s2 = "xxsaaassdcdd";

        if(czyAnagramy(s1,s2)){
            System.out.println("to anagramy");
        }
        else
            System.out.println("to nie są anagramy");

    }
}
