package com.company.sortowanie;

public class MS1a2 {

    public static void main(String[] args){
        int[] A = {2,4,6,8};
        int[] B = {0,1,3,3,3};
        int[] C = new int[9];

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
        for(int x: C){
            System.out.print(x + " ");
        }

    }
}
