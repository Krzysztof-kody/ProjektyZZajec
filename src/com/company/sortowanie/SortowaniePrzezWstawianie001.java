package com.company.sortowanie;
// Taniec:
// https://www.youtube.com/watch?v=ROalU379l3U
// sc50:
// https://www.youtube.com/watch?v=O0VbBkUvriI

public class SortowaniePrzezWstawianie001 {

    public static void main(String[] args) {

        int[] nazwa = new int[10];

        int c;
        int j;
        for(int i = 0; i < 10; i++) {
            nazwa[i] = (int) (Math.random() * 50);
        }

        // 2 3 1
        // 2 1 3

        for(int i = 1; i < 10; i++){
            j = i;
            while(j > 0) {
                if (nazwa[j - 1] <= nazwa[j]) {
                    break;
                }
                c = nazwa[j];
                nazwa[j] = nazwa[j - 1];
                nazwa[j - 1] = c;
                j--;
            }
        }
    }
}
