package com.company;

public class SitoErastotenesa {

    public static void main(String[] args){
        boolean[] liczby = new boolean[100001];
        liczby[0] = true;
        liczby[1] = true;
        for( int n = 2; n < 100001; n++) {
            if(liczby[n]==false) {
                for (int i = n + n; i < 100001; i += n) {
                    liczby[i] = true;
                }
            }
        }
        int licz = 0;
        for(int i = 0; i< 100001; i++){
            if(liczby[i]==false) {
                System.out.print(i + " ");
                licz++;
                if(licz % 20 == 0)
                    System.out.println();
            }
        }
    }
}


