package com.company;

import java.util.*;
// https://youtu.be/lyZQPjUT5B4
public class SortowanieBabelkowe {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9
        int[] zbior = new int[10];
        for (int i = 0; i < 10; i++){
            zbior[i] = (int)(Math.random()*100 + 100);
            System.out.print(zbior[i] + " ");
        }
        System.out.println("------");
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

         */

        int c = 0;
        int czy = 0;

        for(int j = 0; j < 9 ; j++) {
            czy = 0;
            for(int i = 0; i < 9-j ; i++) {
                System.out.print(".");
                if (zbior[i] > zbior[i + 1]) {
                    czy++;
                    c = zbior[i];
                    zbior[i] = zbior[i + 1];
                    zbior[i + 1] = c;
                }
            }
            if(czy == 0) break;

        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.print(zbior[i] + " ");
        }
    }
}
