package com.company;

public class Palindrom1e2 {

    static boolean czyPalindrom1(int a){
        int c = a;
        int b = 0;
        while(a>0) {
            b = b*10 + a%10;
            a /= 10;
        }
        if(c == b){
            return true;
        }
        return false;
    }

    static boolean czyPalindrom1(String s){
        String x = "";
        for (int i = 0; i < s.length(); i++){
            x = x + s.charAt(s.length() - i - 1);
        }
        if(s.equals(x)){
            return true;
        }
        return false;
    }

    static boolean czyPalindrom2(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        if(czyPalindrom1("kajak"))
            System.out.println("tak");
        else
            System.out.println("nie");
        if(czyPalindrom2("kajak"))
            System.out.println("tak");
        else
            System.out.println("nie");


    }

}
