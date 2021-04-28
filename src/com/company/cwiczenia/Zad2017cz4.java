package com.company.cwiczenia;

public class Zad2017cz4 {



    public static void main(String[] args) {
        boolean[] lPierwsze = new boolean[10001];

        lPierwsze[0] = true;
        lPierwsze[1] = true;

        for(int i = 2; i <10001; i++){
            if(lPierwsze[i] == false) {
                for (int j = i * 2; j < 10001; j += i) {
                    lPierwsze[j] = true;
                }
            }
        }

    }
}
