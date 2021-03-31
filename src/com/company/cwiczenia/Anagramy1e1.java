package com.company.cwiczenia;

public class Anagramy1e1 {
    public static void main(String[] args){
// 'a' -> 0
        int[] ascii = new int[26];
        String s = "aabbccddaaa";
        for(int i = 0; i< s.length(); i++){
            ascii[s.charAt(i) - 97]++;
        }
        for(int i=0; i<26; i++){
            System.out.println( i + ". " + ascii[i]);
        }


    }
}
