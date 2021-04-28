package com.company.cwiczenia;

public class NWW1a2 {
    // NWW(a,b) = (a*b) / NWD(a,b)
    public static void main(String[] args) {
        // 7
        // 15
        // 15 16 17 ....
        int a = 7;
        int b = 15;
        int d = a;
        int e = b;
        int i = 0;
        for(i = a; ((i%a == 0) && (i%b == 0))==false; i++ );
        System.out.println(i);


        while(a!=b) {
            if (a < b) {
                a += d;
            } else {
                b += e;
            }
        }
        System.out.println(a);
    }
}
