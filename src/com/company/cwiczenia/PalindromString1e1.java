package com.company.cwiczenia;

public class PalindromString1e1 {

    public static boolean czyPalindrom1(String s){
        for(int i = 0; i< s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean czyPalindrom2(String s) {
        String s1 = "";
        for(int i = 0; i< s.length(); i++){
            s1 = s.charAt(i) + s1;
        }
        return s.equals(s1);
    }
    public static void main(String[] args){

        char[] litery = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String s = "";
        int los;
        int dl;
        for(int j=0; j<10;j++) {
            s="";
            dl = (int) (Math.random() * 21);
            if (dl % 2 == 1)
                s += litery[(int) (Math.random() * litery.length)];
            for (int i = 0; i < dl / 2; i++) {
                los = (int) (Math.random() * litery.length);
                s = litery[los] + s + litery[los];
            }
            System.out.println(s);
        }
    }

}
