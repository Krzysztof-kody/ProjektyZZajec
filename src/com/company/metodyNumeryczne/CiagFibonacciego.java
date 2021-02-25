package com.company.metodyNumeryczne;

import java.util.Scanner;

public class CiagFibonacciego {
    /*

    Ciąg Fibonacciego - n-ty element ciągu tworzymy sumując dwa
    poprzedzajace go elementy. dwoma pierwszymi elementami ciągu
    są 0 i 1.

    Przykład:
    0 1 1 2 3 5 8 13 21 34 ...

    rekurencyjny wzór na n-ty element ciągu:

         | 0 gdy n = 0
    f_n =| 1 gdy n = 1
         | f_(n-2) + f_(n-1) gdy n > 1

     */

    // ładny zapis, ale okropna złożoność obliczeniowa i pamięciowa - wspróbój wyznaczyć np. 45ty element ciągu
    public static int ciagFibonacciegoRekurencyjnie(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return ciagFibonacciegoRekurencyjnie(n - 2) + ciagFibonacciegoRekurencyjnie(n - 1);
    }

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
            System.out.print(a + " ");
            c = a;
            a = b;
            b = b + c;
        }
        System.out.println();

        System.out.println("Element nr " + il + " ciągu Fibonacciego wyznaczony rekurencyjnie: " + ciagFibonacciegoRekurencyjnie(il));
    }
}
