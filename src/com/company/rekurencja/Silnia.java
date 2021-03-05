package com.company.rekurencja;


public class Silnia {

    public static int silnia(int n) {
        if(n == 0) return 1;
        return silnia(n-1)*n;
    }

    public static void petla(int n){
        if(n > 0){

            System.out.println("petla(" + n + " - 1)");
            petla(n-1);
            System.out.println("wyswietlanie");
            System.out.println(n);

        }
    }

    public static double pierwiastek(double n, double A, double B){
        double sr = (A+B)/2;

        if(B - A < 0.0001) return sr;
        if(sr * sr >= n) return pierwiastek(n, A, sr);
        else
        return  pierwiastek(n, sr, B);

    }

    public static void main(String[] args) {
        System.out.println(pierwiastek(9, 2, 5));
        //System.out.println(silnia(3));
    }
}
