package com.company.sortowanie;



public class QS003 {

    public static double pierwiastek(double n, double A, double B){
        double sr = (A + B) / 2;
        if(B - A < 0.000001){ return sr;}
        if(sr * sr > n){ return pierwiastek(n,A,sr);}
        else { return pierwiastek(n,sr,B);}
    }

    public static int silnia(int n){
        if(n == 0) return 1;
        return silnia(n-1)*n;
    }

    public static void petla(int n){
        if(n > 0){
            System.out.println("petla(" + n + " - 1)");
            petla(n-1);
            System.out.println("wypisanie");
            System.out.println(n);
        }
    }


    public static void main(String[] args){
        System.out.println(pierwiastek(9,1,9));
    }
}
