package com.company.ProjektZPlikami;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu("src/com/company/ProjektZPlikami/menu.txt");
        menu.wypisz();
    }
}
