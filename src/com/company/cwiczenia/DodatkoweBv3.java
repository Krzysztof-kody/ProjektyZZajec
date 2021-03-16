package com.company.cwiczenia;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class DodatkoweBv3 {

    public static void main (String[] args) throws IOException {
        File plik = new File("src/com/company/cwiczenia/DB.txt");
        Scanner in = new Scanner(plik);
        int[] zbior = new int[6];
        int n = 0;

        for (int i = 0; i < 6; i++) {
            zbior[i] = in.nextInt();
        }
        int m = zbior[0];
        in.nextLine();
        String a = in.nextLine();
        String b = in.nextLine();
        for (int i = 0; i < 5; i++){
            if (zbior[i] > n) {
                n = zbior[i];
            }
            if (m >zbior[i]) {
                m = zbior[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a);
        }
        for(int i=0;i<m;i++){
            System.out.println(b);
        }
    }
}