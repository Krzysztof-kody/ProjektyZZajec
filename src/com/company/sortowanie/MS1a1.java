package com.company.sortowanie;

public class MS1a1 {
    public static void main(String[] args){

        int[] A = {1,4,8,9};
        int[] B = {0,2, 3,5};
        int[] C = new int[8];

        int i = 0;
        int j = 0;
        for(int k = 0; k < 8; k++){
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

        for(int e: C){
            System.out.print(e + " ");
        }

    }
}
