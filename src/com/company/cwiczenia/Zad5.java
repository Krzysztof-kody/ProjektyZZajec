package com.company.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
5. Odczytać z pliku 4 slowa zapisane w osobnych liniach np.
slowo1
slowo2
slowo3
slowo4
i wyświetlić je w 1 linii. Słowa mają być oddzielone spacjami a po ostatnim słowie musi pojawić sie kropka, bez spacji.
 */
public class Zad5 {
    public static void main (String[] a) throws FileNotFoundException {
        File plik = new File("src/com/company/cwiczenia/Zad5.txt");
        Scanner zPliku = new Scanner(plik);
        /*for (int i = 0; i < 4; i++) {
            System.out.print(zPliku.nextLine());
            if(i == 3)
                System.out.print(".");
            else
                System.out.print(", ");
        }*/
       // System.out.println(zPliku.nextLine() + ", " + zPliku.nextLine() + ", " + zPliku.nextLine() + ", " + zPliku.nextLine() + "." );
        while (true){
            System.out.print(zPliku.nextLine());
            if(zPliku.hasNext()){
                System.out.print(", ");
            }
            else{
                System.out.print(".");
                break;
            }
        }
    }
}
