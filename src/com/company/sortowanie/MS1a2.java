package com.company.sortowanie;

import java.util.Arrays;

public class MS1a2 {

    static void merge(int[] A, int[] B, int[] C){
        int i = 0;
        int j = 0;
        for(int k = 0; k < C.length ; k++) {
            if(i >= A.length){
                C[k] = B[j];
                j++;
                continue;
            }
            if(j >= B.length){
                C[k] = A[i];
                i++;
                continue;
            }
            if(A[i] < B[j]){
                C[k] = A[i];
                i++;
            }
            else{
                C[k] = B[j];
                j++;
            }
        }
    }

    static void mergeSrt(int[] C){
        if(C.length >1){
            int sr = C.length / 2;
            int[] A = new int[sr];
            int[] B = new int[C.length - sr];

        }
    }

    public static void main(String[] args){
        int[] A = {2,4,6,8};
        int[] B = {0,1,3,3,3};
        int[] C = new int[9];
        merge(A,B,C);
        for(int x: C){
            System.out.print(x + " ");
        }

    }
}
