package com.company.cwiczenia;

import java.util.Arrays;

public class Anagramy1e1 {

    static boolean czyAnagramy(String s, String s2){
        int[] ascii = new int[26];
        int[] ascii2 = new int[26];
        if(s.length() != s2.length()) return false;
        for(int i = 0; i< s.length(); i++){
            ascii[s.charAt(i) - 'a']++;
            ascii2[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(ascii[i] != ascii2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s = "aabbccddaaa";
        String s2 ="aaaaaccddbb";

        char[] sCh = s.toCharArray();
        char[] s2Ch = s2.toCharArray();

        Arrays.sort(sCh);
        Arrays.sort(s2Ch);

        String sW = new String(sCh);
        String s2W = new String(s2Ch);


        //if(czyAnagramy(s,s2)){
        if(sW.equals(s2W)){
            System.out.println("to sa anagramy");
        }
        else
            System.out.println("to nie są anagramy");

    }
}
