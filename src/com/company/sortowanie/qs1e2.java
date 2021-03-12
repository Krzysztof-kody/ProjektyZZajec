package com.company.sortowanie;

import java.util.Arrays;
import java.util.Collections;

public class qs1e2 {

    public static void swap(int[] A, int i, int j){
        int c = A[i];
        A[i] = A[j];
        A[j] = c;

    }
    public static void qs(int[] A, int l, int p){
        if(l<p) {
            int i = l;
            int c;
            for (int j = l; j <= p; j++) {
                if (A[j] < A[l]) {
                    i++;
                    swap(A,i,j);
                }
            }
            swap(A, i, l);
            qs(A, l, i - 1);
            qs(A, i + 1, p);
        }
    }


    public static void main(String[] args){
        //          l             p
        //          0 1 2 3 4 5 6 7
        int[] A =  {6,1,3,7,3,9,0,2};
        int l = 0;
        int p = 7;

        qs(A,l, p);

        for(int el: A){
            System.out.print(el + " ");
        }


    }




}
