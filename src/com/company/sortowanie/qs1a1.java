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

    public static void qs(int[] A, int l, int p){
        if(l<p) {
            int i = l;
            // l           p
            // 0 1 2 3 4 5 6
            int c;
            for (int j = l; j <= p; j++) {
                if (A[j] < A[l]) {
                    i++;
                    c = A[i];
                    A[i] = A[j];
                    A[j] = c;
                }
            }
            c = A[i];
            A[i] = A[l];
            A[l] = c;

            qs(A,l,i-1);
            qs(A, i+1, p);
        }
    }

    public static void main(String[] args){
        int[] A = {3,1,6,3,7,2,1};
        qs(A, 0, 6);
        for(int el: A){
            System.out.print( el + " ");
        }


    }
}
