package com.company.cwiczenia;

public class Anagramy1a1 {
    public static void main(String[] args){
             String s1 = "abdsa";
             int[] litery = new int[26];
             for(char l: s1.toCharArray()){
                 litery[l-'a']++;
             }
             for(int i =0; i< litery.length;i++){
                 System.out.println(i + ": " + litery[i]);
             }
    }
}
