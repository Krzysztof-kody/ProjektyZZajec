package com.company.petle;

import java.util.Scanner;

public class For {

        public static void main(String[] args) {

            // tradycyjny for z 3 elementami
            // zwiększenie i o 1 co wykonanie pętli
            System.out.println("Zwiększenie o 1: ");
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            // tradycyjny for z 3 elementami
            // zwiększenie i o 5 co wykonanie pętli
            System.out.println("Zwiększenie o 5: ");
            for(int i = 0; i < 100; i+=5){
                System.out.print(i + " ");
            }
            System.out.println();
            // tradycyjny for z 3 elementami
            // zmiana i o -1 co wykonanie pętli
            System.out.println("Zmiana o -1: ");
            for(int i = 10; i > 0; i--){
                System.out.print(i + " ");
            }
            System.out.println();
            // tradycyjny for z 3 elementami
            // zmiana i o -1 co wykonanie pętli
            System.out.println("Zmiana o -5: ");
            for(int i = 100; i > 0; i-=5){
                System.out.print(i + " ");
            }
        }
}
