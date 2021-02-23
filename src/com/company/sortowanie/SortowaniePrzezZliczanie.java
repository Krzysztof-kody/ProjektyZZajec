package com.company.sortowanie;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] wartosci = new int[11];
        int[] tab = new int[10];
        for(int i = 0; i < 10 ; i++) {
            tab[i] = (int) (Math.random() * 10);
        }
    /* 0-5
         3 2 2
      0 1 2 3 4 5
      0 0 2 1 0 0
    */
        for (int i = 0; i < 10; i++) {
            wartosci[tab[i]]++;
        }
        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < wartosci[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
