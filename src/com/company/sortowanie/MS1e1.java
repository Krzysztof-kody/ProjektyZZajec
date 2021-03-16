package com.company.sortowanie;

public class MS1e1 {
    public static void merge(int[] A, int[] B, int[] C){
        int a = 0;
        int b = 0;
        int dl = A.length + B.length;
        for (int i = 0; i < dl; i++) {
            if(b == B.length) {
                C[i] = A[a];
                a++;
                continue;
            }
            if(a == A.length){
                C[i] = B[b];
                b++;
                continue;
            }
            if(A[a] < B[b]){
                C[i] = A[a];
                a++;
            }
            else{
                C[i] = B[b];
                b++;
            }
        }
    }


    public static void mergeSort(int[] A){
        if(A.length > 1){
            int sr = (A.length)/2;
            int[] B = new int[sr];
            int[] C = new int[A.length - sr];
            for(int i = 0; i < sr; i++){
                B[i] = A[i];
            }
            for(int i = 0; i < (A.length - sr); i++){
                C[i] = A[i + sr];
            }
            mergeSort(B);
            mergeSort(C);
            merge(B, C, A);
        }
    }

    public static void main(String[] args){

        int[] X = { 5,2,7,3,9,1,8};
        int[] A = {1, 4, 7, 9};
        int[] B = {0, 2 , 3};
        int[] C = new int[7];

        mergeSort(X);

        for(int l: X){
            System.out.print(l + " ");
        }
    }

}
