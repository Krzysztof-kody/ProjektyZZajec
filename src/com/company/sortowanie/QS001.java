package com.company.sortowanie;

public class QS001 {
/*
                               j
             i
    6 17 16     21    69 79 73 70 49 74


 */
    public static void swap(int[] A, int i, int j){
        int c;
        c = A[i];
        A[i] = A[j];
        A[j] = c;
    }

    public static void rek(int n){
        if(n > 0){

            System.out.println("rek(" + (n-1) + ")");
            rek(n-1);

            System.out.println("wypisanie");
            System.out.println(n);
        }
    }

    public static int sil(int n) {
        if(n == 0) return 1;
        return sil(n-1)*n;
    }

        public static void main(String[] args){

            System.out.println(sil(5));


        /*
        int[] tablica = new int[10];

        for (int i = 0; i <10 ; i++) {
            tablica[i] = (int)(Math.random()*100);
            System.out.print(tablica[i] + " ");
        }

        int piv = tablica[0];
        int c;
        int i = 0;
        for (int j = 1; j < 10; j++) {
            if(tablica[j] < piv){
                i++;
             swap(tablica, i, j);
            }
        }
        swap(tablica,0,i);

        System.out.println();
        for (int j = 0; j <10 ; j++) {
            System.out.print(tablica[j] + " ");
        }*/
    }


}
