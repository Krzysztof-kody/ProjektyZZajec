package com.company.sortowanie;
// Taniec:
// https://www.youtube.com/watch?v=ROalU379l3U
// sc50:
// https://www.youtube.com/watch?v=O0VbBkUvriI

public class SortowaniePrzezWstawianie {

    public static void main(String[] args) {
        int[] zbior = new int[10];
        int j;
        int c;

        for (int i = 0; i < 10; i++){
            zbior[i] = (int)(Math.random()*100 + 100);
            System.out.print(zbior[i] + " ");
            j = i;
            while(j > 0){
                System.out.print(".");
                if(zbior[j] >= zbior[j-1]){
                    break;
                }
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
