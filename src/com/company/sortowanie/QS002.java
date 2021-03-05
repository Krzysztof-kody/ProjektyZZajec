package com.company.sortowanie;

public class QS002 {
/*                                 j
                    i
        33 25 25 18 5 48 88 54 94 56
        pi
        5 25 25 18     33    48 88 54 94 56


 */
    public static void main(String[] args){
        int[] T = new int[10];
        for (int i = 0; i < 10; i++) {
            T[i] = (int)(Math.random()*100);
            System.out.print(T[i] + " ");
        }

        int piv = T[0];
        int i = 0;
        int c;
        for (int j = 1; j < 10; j++) {
           if(T[j] < piv){
               i++;
               c = T[i];
               T[i] = T[j];
               T[j] = c;
           }
        }
        c = T[i];
        T[i] = T[0];
        T[0] = c;


        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print(T[j] + " ");
        }
    }
}
