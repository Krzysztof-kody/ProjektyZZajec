package com.company.cwiczenia.gra1a1;

import java.util.ArrayList;

public class gra {


    public static void main(String[] args){

        Stworek tama = new Stworek("Stefan");
        ArrayList<Przedmiot> apteczki = new ArrayList<>();

        apteczki.add(new Przedmiot("apteczka", 50, 0,0,0,0));

        tama.przywitajSie();

        while(tama.gramy) {
            tama.statystyki();
            tama.setSytosc(100);
            tama.stan();
            if(tama.zdrowie < 60){
                if(apteczki.size()>0){
                    apteczki.get(0).uzyj(tama);
                    apteczki.remove(0);
                }
            }
        }

    }

}
