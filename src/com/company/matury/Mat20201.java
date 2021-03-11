package com.company.matury;

public class Mat20201 {
    public static void main(String[] args){
        int n = 6;
        int k = 2;

        int[] A = {1,2,3,4,5,6};
        int[] B = {3,4,5,6,1,2};

        System.out.println(czy_k_podobne(n, A, B, k));

    }
    private static boolean czy_k_podobne(int n, int[] A, int[] B, int k) {

        for(int i = 0; i < k; i++){
           if(A[i] != B[n - k + i ]) return false;
        }
        for(int i = 0; i < n - k; i++){
            if(B[i] != A[k+i]) return false;
        }
        return true;
    }
}
