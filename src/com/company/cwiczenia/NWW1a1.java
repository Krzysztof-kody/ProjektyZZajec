package com.company.cwiczenia;

public class NWW1a1 {
    static int NWDrr(int a, int b){
        return b==0?a:NWDrr(b, a % b);
    }

    //  (a*b)/nwd(a,b)
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int A = a;
        int B = b;

        while (a != b) {
            if (a < b) {
                a += A;
            } else {
                b += B;
            }
        }
        System.out.println(a);
        System.out.println((a*b)/NWDrr(a,b));
    }
}