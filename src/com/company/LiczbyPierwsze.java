package com.company;

public class LiczbyPierwsze {

    public static void main(String[] args) {

        int k=30;

        int n = k-1;

        while(n > 1){
            if(k % n == 0){
                System.out.println(".");
               // break;
            }
            n--;
        }

    }

}
