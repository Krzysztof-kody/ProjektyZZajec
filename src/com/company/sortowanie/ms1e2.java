package com.company.sortowanie;

public class ms1e2 {


    public static void main(String[] args){
        int[] B = {1,4,7,9};
        int[] A = {2,3,5};
        int[] C = new int[7];

        int a = 0;
        int b = 0;

        for(int i= 0; i<7; i++){
            if(b >= B.length){
                for(int j = a; j < A.length; j++){
                    C[i] = A[j];
                    i++;
                }
                break;
            }
            if(a >= A.length){
                for(int j = b; j < B.length; j++){
                    C[i] = B[j];
                    i++;
                }
                break;
            }

            if(b < B.length && a < A.length) {
                if (A[a] < B[b]) {
                    C[i] = A[a];
                    a++;
                } else {
                    C[i] = B[b];
                    b++;
                }
            }
        }
        for(int el: C){
            System.out.print(el + " ");
        }
    }
}