package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zad2017cz4a1 {


    public static void cyfropodobne(String a, String b){
        Map<Character, Integer> C1 = new TreeMap<>();
        Map<Character, Integer> C2 = new TreeMap<>();
// 1112 '1'->1 '1'->1 '1'->1 '2'->1 ---> '1'-> 1 '2' ->1
        // "dog" "pies"//

        for(int i =0; i< a.length(); i++) {
            C1.put(a.charAt(i), 1);
        }
        for(int i =0; i< b.length(); i++) {
            C2.put(b.charAt(i), 1);
        }
        if(C1.equals(C2))
            System.out.println("tak");
        else
            System.out.println("nie");
/*
        for(Map.Entry<Character, Integer> i: C2.entrySet()){
            System.out.println(i);
        }
        for(Map.Entry<Character, Integer> i: C1.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
        }
*/

    }


    public static void main(String[] args) throws FileNotFoundException {

        boolean[] sito = new boolean[10001];
        sito[0] = true;
        sito[1] = true;
        for(int i = 2; i < 10001; i++){
            if(sito[i]== false){
                for(int j= i+i; j <10001; j += i){
                    sito[j] = true;
                }
            }
        }

/*
        File plik = new File("src/com/company/cwiczenia/punkty.txt");
        Scanner in = new Scanner(plik);
        int n = 0;
        int m = 0;
        int licznik = 0;
        for(int i = 0; i <1000; i++){
            n = in.nextInt();
            m = in.nextInt();
            if(sito[n]==false && sito[m]==false)
            licznik++;
        }
        System.out.println(licznik);
    // Zad. dom. Dokończenie zadania 4.1 z matury 2017 czerwiec
 */
    cyfropodobne("123","13201");
    }

}
