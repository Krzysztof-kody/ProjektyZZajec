package com.company.sortowanie;

public class qs1a1 {


    static void petla(int n, int m){
        if(n > 0){
            System.out.print(n + " " + m + " ");
            System.out.println("petla(" + (n - 1) + "," + m +")");
            petla(n-1, m*2);
        }
    }

    static int silnia(int n){
        if(n == 0) return 1;
        return silnia(n - 1) * n;
    }

/*
    5! = 1 * 2 * 3 * 4 * 5
                     | 1 ; n = 0
    silnia(n) = n! = |
                     |  silnia(n - 1) * n; n > 0


    120
                    24
    silnia(5) = silnia(4) * 5 = 120

                    6
    silnia(4) = silnia(3) * 4 = 24

                    2
    silnia(3) = silnia(2) * 3 = 6

                   1
    silnia(2) = silnia(1) * 2 = 2

                    1
    silnia(1) = silnia(0) * 1 = 1
    silnia(0) = 1

*/
    public static void main(String[] args){

        System.out.println(silnia(5));
    }
}
