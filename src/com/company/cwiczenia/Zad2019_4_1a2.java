package com.company.cwiczenia;

public class Zad2019_4_1a2 {



    public static void main(String[] args){
        int a = 81;
czyPotegaTrojki(12365); -> p/f

        while(a > 1){
            if(a % 3 == 0)
                a /=3;
            else
                break;
        }
        if(a == 1)
            System.out.println("tak");
        else
            System.out.println("nie");
        //System.out.println(a);
    }
}
