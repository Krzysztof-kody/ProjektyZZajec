package com.company.metodyNumeryczne;

import java.util.Scanner;

public class PotegaOWykladnikuNaturalnym{
    /*

    Potęga to skrócony zapis mnożenia. W wersji programistycznej
    możemy przyjąć, że wykłądnik mówi ile razy musimy przemnożyć
    1 przed podstawę potęgowania np.:

    2^2 = 1 * 2 * 2 = 4

    przyjęcie takiej definicji pozwala na łątwe wyznaczenie
    zerowej potęgi dowolnej liczby np.

    4^0 = 1

    ponieważ 1 mnożumy zero ray przez 4

    Wzór rekurencyjny:

          | 1 gdy n = 0
    a^n = |
          | a^(n-1) * a dla n > 0

    powyższy wzór działa dla n które jest całkowite i nieujemne

     */

    public static double potegaRekurencyjnie(double a, int n){
        if(n == 0) return 1;
        return potegaRekurencyjnie(a, n -1) * a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();

        double wynik = 1;

        for (int i = 0; i < n; i++) {
            wynik *= a;
        }

        System.out.println("Potęga wyznaczona iteracyjnie: " + wynik);
        System.out.println("Potęga wyznaczona rekurencyjnie: " + potegaRekurencyjnie(a,n));

    }
}
