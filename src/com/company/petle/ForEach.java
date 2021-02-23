package com.company.petle;

public class ForEach {
    public static void main(String[] args) {

        // stworzona tablica 10cioelementowa intów
        int[] liczby = new int[10];

        // wypełnienie tablicy wartościami "losowymi" z zakresu 0-10
        // "przejście" po tablicy za pomoca indeksów
        for (int i = 0; i < 10; i++) {
            liczby[i] = (int) (Math.random() * 10);
        }

        // pętla foreach - "przejdzie" przez cały zbiór liczby wyciągając
        // do zmiennej 'liczba' kolejne elementy zbioru
        // dzięki temu możemy wypisywać zmmieniające się wartości
        // zmiennej 'liczba'
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
    }
}
