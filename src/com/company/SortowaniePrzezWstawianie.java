package com.company;

public class SortowaniePrzezWstawianie {

    public static void main(String[] args) {
        int[] zbior = new int[10];
        int a;
        int j;
        int c;

        for (int i = 0; i < 10; i++){
            a = (int)(Math.random()*100 + 100);
            System.out.print(a + " ");
            j = i;

            /*
            5 3 7 1 0

            5 3
            3 5 7 1
            1 3 5 7 0
            0 1 3 5 7
             */
            zbior[i] = a;
            while(j > 0){

                if(zbior[j] >= zbior[j-1])
                    break;
                c = zbior[j-1];
                zbior[j-1] = zbior[j];
                zbior[j] = c;
                j--;
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(zbior[i] + " ");
        }

        }
}
