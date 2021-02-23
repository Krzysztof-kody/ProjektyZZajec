package com.company.metodyNumeryczne;

  /*

        Silnia z n to działanie matematyczne, które jest równoważne
        iloczynowi wszystkich liczb naturalnych liczb mniejszych
        niż n:
        5! = 1 * 2 * 3 * 4 * 5

        Możemy też użyć definicji rekurencyjnej:

             | 1 gdy n = 0
        n! = |
             | (n - 1)! * n

        możemy ten wzór użyć w następujący sposób

        5! = 4! * 5
        4! = 3! * 4
        3! = 2! * 3
        2! = 1! * 2
        1! = 0! * 1
        0! = 1
        1! = 1 * 1 = 1
        2! = 1 * 2 = 2
        3! = 2 * 3 = 6
        4! = 6 * 4 = 24
        5! = 24 * 5 = 120

         */


public class Silnia {


    public static int silniaRekurencyjnie(int n){
        if(n == 0) return 1;
        return silniaRekurencyjnie(n-1) * n;
    }

    public static void main(String[] args) {

        // silnia opisana iteracyjnie (pętle)

        int n = 5;
        int wynik = 1;

        while(n > 1){
            wynik *= n;
            n--;
        }
        System.out.println("iteracyjnie: " + wynik);

        System.out.println("rekurencyjnie: " + silniaRekurencyjnie(5));
    }
}
