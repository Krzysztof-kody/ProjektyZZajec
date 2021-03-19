package com.company.sortowanie;

public class MS1a1 {

     static void merge(int[] A, int[] B, int[] C){
        int i = 0;
        int j = 0;
        for(int k = 0; k < A.length + B.length; k++){
            if(j >= B.length){
                C[k] = A[i];
                i++;
                continue;
            }
            if(i >= A.length) {
                C[k] = B[j];
                j++;
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

     static void mergeSort(int[] C){


         if(C.length > 1){

             int sr = C.length /2;
             int[] A = new int[sr];
             int[] B = new int[C.length-sr];


         }
    }

    public static void main(String[] args){

        int[] A = {1,4,8,9};
        int[] B = {0,2, 3,5};
        int[] C = new int[A.length + B.length];

        merge(A, B, C);

        for(int e: C){
            System.out.print(e + " ");
        }

    }
}
