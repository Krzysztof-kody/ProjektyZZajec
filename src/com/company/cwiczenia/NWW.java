package com.company.cwiczenia;

public class NWW {
    static int NWD2(int a, int b){
        return a%b!=0?NWD2(b, a % b):b;
    }
    public static void main(String[] args) {
        // 2 3
        // 2 4
        int a = 15;
        int b = 10;
        int aa = a;
        int bb = b;


        while(aa != bb) {
            if (aa < bb) {
                aa += a;
            } else {
                bb += b;
            }
        }

        System.out.println(aa);
        System.out.println((a*b)/NWD2(a,b));
    }
}
