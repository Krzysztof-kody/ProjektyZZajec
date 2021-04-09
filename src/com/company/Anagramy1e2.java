package com.company;

public class Anagramy1e2 {

    public static void main(String[] args){
     String s1 = "abbacb";
     String s2 = "bababc";
    boolean czyAnagram = true;
     if(s1.length() != s2.length()) czyAnagram = false;
        for(int i=0; i < s1.length(); i++) {
            s2 = s2.replaceFirst("" + s1.charAt(i), "");
        }

     if(s2.length()==0&&czyAnagram==true){
         System.out.println("anagramy");
     }
     else
         System.out.println("to nie są anagramy");



    }
}
