package com.company.sortowanie;
/*
selection sort
Filmy:
    https://www.youtube.com/watch?v=R_f3PJtRqUQ
    https://www.youtube.com/watch?v=3hH8kTHFw2A     (cs50)

 */
public class SortowaniePrzezWybor {

    public static void main(String[] args) {

        int[] nazwa = new int[10];
        int tmp = 1000;
        int id = 0;
        int c;

        /*
        GENEROWANIE
         */
        for(int i = 0; i < 10 ; i++) {
            nazwa[i] = (int) (Math.random() * 100);
        }
        /*
        SORTOWANIE
         */

        for (int i = 0; i < 9; i++) {
            id = 0;
            tmp = 1000;
            for (int j = i; j < 10; j++) {
                System.out.print(".");
                if(tmp > nazwa[j]) {
                    tmp = nazwa[j];
                    id = j;
                }
            }
            c = nazwa[i];
            nazwa[i] = tmp;
            nazwa[id] = c;
        }

    }
}
