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



    public static void main(String[] args){

        String s = "kajak";
        String x = "";
        for (int i = 0; i < s.length(); i++){
           x = x + s.charAt(s.length() - i - 1);
        }
        System.out.println(x);
        if(s.equals(x)){
            System.out.println("tak");
        }
        else{
            System.out.println("nie");
        }

    }

}
