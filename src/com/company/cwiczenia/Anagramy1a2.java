package com.company.cwiczenia;

public class Anagramy1a2 {
    public static void main(String[] args){
        String s1 = "aaasxsxsddd";
        String s2 = "xxsaaassddd";

        int[] litery = new int[26];
        for(int i = 0 ; i < s1.length(); i++){
            litery[s1.charAt(i)-'a']++;
        }
        int[] litery2 = new int[26];
        for(int i = 0 ; i < s2.length(); i++){
            litery2[s2.charAt(i)-97]++;
        }

        for (int i = 0; i <litery.length; i++){
            if(litery[i] != litery2[i]){
                System.out.print("nie ");
                break;
            }
        }
        System.out.println("są anagramami");

        for (int i = 0; i <litery.length; i++) {
            System.out.println(litery2[i]);
        }


    }
}
