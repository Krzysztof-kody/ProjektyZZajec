package com.company.cwiczenia;

public class Funkcje {

    public static void f(int[] a){
        a[0] = 5;
        System.out.println(a[0] + "..");
    }

    public static void main(String[] args) {
        int[] a = {3};
        f(a);
        System.out.println(a[0]);
    }

}
