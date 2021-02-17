package com.company;

import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) {

        /*
            a b
          a b
        a b
        0 1 1 2 3 5 8 13 21 ...

        c = a;
        a = b;
        b = b + c;

         */
        int a = 0;
        int b = 1;
        int c = a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość elelemtów ciągu");
        int il = sc.nextInt();
        for(int i = 0; i<il; i++){
            System.out.print(a + ": ");
            c = a;
            a = b;
            b = b + c;
        }

    }
}
