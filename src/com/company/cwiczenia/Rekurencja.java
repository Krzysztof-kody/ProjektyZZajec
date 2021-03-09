package com.company.cwiczenia;

public class Rekurencja {


    /*
    SILNIA

                     | 1 ; n = 0
    silnia(n) = n! = |
                     | (n - 1)! * n; n > 0


    120
    silnia(5) = silnia(5-1) * 5 = 24 * 5
    silnia(4) = silnia(3) * 4 = 6 * 4
    silnia(3) = silnia(2) * 3 = 2 * 3
    silnia(2) = silnia(1) * 2 = 1 * 2
    silnia(1) = silnia(0) * 1 = 1 * 1
    silnia(0) = 1

-----------------------------------------------------
    POTEGA

                          | 1; n = 0
    potega(a, n) = a^n =  |
                          | a ^ (n-1) * a; n > 0

    2^3 = potega(2,3) = potega(2,2) * 2
    potega(2, 2) = potega(2, 1) * 2
    potega(2, 1) = potega(2, 0) * 2
    potega(2, 0) = 1
-----------------------------------------------------
    n

    1 --------------sr-------------- n
    A                                B

    koniec -> (B - A < błąd) /0.00001/ -> A, B, (A+B)/2

    sr = (A+B)/2

    1.

    (sr*sr) > n -> B = sr

    2.

    (sr*sr) <= n -> A =sr

                           | (A+B)/2; B-A < 0.00001
    pierwiastek(n, A, B) = | pierwiastek(n, A, (A+B)/2); ((A+B)/2)*((A+B)/2) > n
                           | pierwiastek(n, (A+B)/2, B); ((A+B)/2)*((A+B)/2) <= n

     */

    static double potega(double a, int n){
        if(n == 0) return 1;
        return potega(a, n - 1) * a;
    }

    static int silnia(int n){
        if(n == 0) return 1;
        return silnia(n-1)*n;
    }

    public static void main(String[] args){
        System.out.println("silnia: " + silnia(5));
        System.out.println("potega: " + potega(2, 10));


    }
}
