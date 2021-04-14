package com.company.cwiczenia;

public class Zad2019_4_1a2 {

    static boolean czyPotegaTrojki(int a){
        while(a > 1){
            if(a % 3 == 0)
                a /=3;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        if(czyPotegaTrojki(243))
            System.out.println("tak");
        else
            System.out.println("nie");

    }
}
