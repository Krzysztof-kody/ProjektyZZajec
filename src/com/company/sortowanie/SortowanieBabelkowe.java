package com.company.sortowanie;

import java.util.*;
// Taniec:
// https://youtu.be/lyZQPjUT5B4
// cs50:
// https://www.youtube.com/watch?v=RT-hUXUWQ2I
public class SortowanieBabelkowe {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9
        int[] zbior = new int[10];
        //int[] zbior = {1,2,3,4,6,5,7,8,9,10};
        for (int i = 0; i < 10; i++){
            zbior[i] = (int)(Math.random()*100 + 100);
            System.out.print(zbior[i] + " ");
        }
        System.out.println();
        System.out.println("------");
        int c;
        boolean posortowany = true;
        for(int j = 0; j < 9; j++){
            posortowany = true;
            for(int i = 0; i < 9-j; i++) {
                System.out.print(".");
                if (zbior[i] > zbior[i + 1]) {
                    posortowany = false;
                    c = zbior[i];
                    zbior[i] = zbior[i + 1];
                    zbior[i + 1] = c;
                }
            }
            if(posortowany == true){
                break;
            }
        }

        /*
        ArrayList<Integer> zbior1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            zbior1.add((int)(Math.random()*100 + 100));
        }
        /*
        1 4 2 5 8 3
          2 4   3 8
        - - - - - max
            |_|
         |x|   |o|

            |x|
         |_|   |o|

            |x|
         |o|   |_|

            |_|
         |o|   |x|

        0 1 2 3 4 5

        5 8 2 6 4 0|
        5 2 6 4 0|8
        2 5 4 0|6 8


        0 1 2 3 4 5

        4 5 6 7 8 9
         */
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.print(zbior[i] + " ");
        }
    }
}
