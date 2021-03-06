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

 6 3 7 4 9
 3 6 7 4 9
 3 4 6 7 9
 ----------

 6 3 7 4 9
 3|6 7 4 9
 3 4|7 6 9
 3 4 6|7 9
 3 4 6 7|9

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

        // 27 - 87

        for(int i = 0; i < 10 ; i++) {
            wartosci[i] = (int) (Math.random() * 60 + 27);
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
            if(min > wartosci[j]) {
                min = wartosci[j];
                id = j;
            }
        }
        c = wartosci[i];
        wartosci[i] = min;
        wartosci[id] = c;
    }
    for (int i: wartosci){
        System.out.print(i + " ");
    }

    }
}
