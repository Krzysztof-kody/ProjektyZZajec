package com.company.cwiczenia;

import java.util.Arrays;

public class Anagramy1e2 {

    static boolean czyAnagramy(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i=0; i < s1.length(); i++) {
            s2 = s2.replaceFirst("" + s1.charAt(i), "");
        }
        if(s2.length() == 0) return true;
        return false;
    }
    static boolean czyAnagramy1(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        String ws1 = new String(ss1);
        String ws2 = new String(ss2);
        return ws1.equals(ws2);
    }

    public static void main(String[] args) {
        String s1 = "acbabb";
        String s2 = "ababcb";

        if(czyAnagramy1(s1,s2)){
            System.out.println("tak");
        }
        else
            System.out.println("nie");

    }
    }
