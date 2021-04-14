package com.company.cwiczenia;
/*

https://classroom.google.com/u/1/c/MTU2ODA3MzkwNDAy
Matura 2019
zadanie 4

 */
public class Zad2019_4_1a1 {

    static boolean czyPotega3(int a){
        while(a > 1) {
            if(a % 3 != 0)
                a = 0;
            a /= 3;
        }
        return a==0?false:true;
    }

    public static void main(String[] args){



        if(czyPotega3(81) == true){
            System.out.println("tak");
        }
        else
            System.out.println("nie");

    }
}
