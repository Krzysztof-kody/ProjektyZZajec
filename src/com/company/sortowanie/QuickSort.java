package com.company.sortowanie;

/*

n-l
https://www.youtube.com/watch?v=MZaf_9IZCrc

animacja
https://www.youtube.com/watch?v=cnzIChso3cc

 */



public class QuickSort {
    public static void swap(int zbior[], int i, int j){
        int c;
        c = zbior[i];
        zbior[i] = zbior[j];
        zbior[j] = c;
    }

    public static void qs(int zbior[], int l, int p){
        if(l < p) {
            int piv = zbior[l];
            int i = l;
            for (int j = 0; j <= p - l; j++) {
                if (zbior[l + j] < piv) {
                    i++;
                    swap(zbior, i, l + j);
                }
            }
            swap(zbior, i, l);
            qs(zbior, l, i - 1);
            qs(zbior, i + 1, p);
        }
    }

    public static void main(String[] args){
        int[] zbior = new int[10];
        for (int i = 0; i < 10; i++){
            zbior[i] = (int)(Math.random()*100 + 100);
            System.out.print(zbior[i] + " ");
        }
        System.out.println();
        qs(zbior,0, 9);

        for(int k: zbior){
            System.out.print(k + " ");
        }
    }
}
