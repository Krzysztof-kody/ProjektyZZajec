package com.company.sortowanie;
/*
selection sort
Filmy:
    https://www.youtube.com/watch?v=R_f3PJtRqUQ
    https://www.youtube.com/watch?v=3hH8kTHFw2A     (cs50)

        pos  | niep
             |3 1 4 2 5
        1    |3 4 2 5
        1 2  |3 4 5
       1 2 3 |4 5
      1 2 3 4 5

 */
public class SortowaniePrzezWybor {

    public static void main(String[] args) {

        int[] wartosci = new int[10];
        int min = 1000;
        int id = 0;
        int c;

        /*
        GENEROWANIE
         */
        for(int i = 0; i < 10 ; i++) {
            wartosci[i] = (int) (Math.random() * 100);
        }

        /*
        SORTOWANIE

        1 2 3
        0 1 2

        min = 1
        id = 0

        min = 2
        id = 1

         */

        for (int i = 0; i < 9; i++) {
            min = wartosci[i];
            id = i;
            for (int j = i + 1; j < 10; j++) {
                System.out.print(".");
                if(min > wartosci[j]) {
                    min = wartosci[j];
                    id = j;
                }
            }
            c = wartosci[i];
            wartosci[i] = min;
            wartosci[id] = c;
        }

    }
}
