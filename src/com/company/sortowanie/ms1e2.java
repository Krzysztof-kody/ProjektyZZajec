package com.company.sortowanie;

public class ms1e2 {
    public static void main(String[] args){
        int[] A = {1,4,7,9};
        int[] B = {2,5,8};
        int[] C = new int[7];
        int a = 0;
        int b = 0;
        for(int i= 0; i<7; i++){
            if(A[a]<B[b]){
                C[i] = A[a];
                a++;
            }else {
                C[i] = B[b];
                b++;
            }
        }
        for(int el: C){
            System.out.print(el + " ");
        }
    }
}