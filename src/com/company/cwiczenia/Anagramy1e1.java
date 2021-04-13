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

    static boolean czyAnagramy2(String s, String s2){
        char[] sCh = s.toCharArray();
        char[] s2Ch = s2.toCharArray();
        Arrays.sort(sCh);
        Arrays.sort(s2Ch);
        String sW = new String(sCh);
        String s2W = new String(s2Ch);
        return sW.equals(s2W);
    }

    public static void main(String[] args){
        String s = "aacbccddaaa";
        String s2 ="aaaaaccddbb";
        //if(czyAnagramy(s,s2)){
        if(czyAnagramy2(s,s2)){
            System.out.println("to sa anagramy");
        }
        else
            System.out.println("to nie są anagramy");
    }
}
