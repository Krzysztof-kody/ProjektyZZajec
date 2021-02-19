package com.company;

import java.util.Scanner;

public class LiczbyPierwsze {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Program sprawdzający czy podana liczba jest pierwsza");
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int k = sc.nextInt();

        boolean pierwsza = true;
        int n = (int)Math.sqrt(k);

        // 16
        // 1 2 4 8 16

        while(n > 1){
            if(k % n == 0){
                pierwsza = false;
                break;
            }
            n--;
        }
        if(pierwsza == true){
            System.out.println("podana liczba jest pierwsza");
        }
        else{
            System.out.println("podana liczba nie jest pierwsza");
        }
    }
}
