package com.company.cwiczenia.gra1a2;

import java.util.ArrayList;

public class gra {

    public static void main(String[] args){
        Stworek tama = new Stworek("Stefan", "różowy");
        ArrayList<Przedmiot> apteczki = new ArrayList<>();
        apteczki.add(new Przedmiot("apteczka", 50, 0,0,0));
        apteczki.add(new Przedmiot("apteczka", 50, 0,0,0));
        ArrayList<Przedmiot> pilki = new ArrayList<>();
        pilki.add(new Przedmiot("pilka", 5,-10, -10,30));
        ArrayList<Przedmiot> energetyki = new ArrayList<>();
        energetyki.add(new Przedmiot("kawa",0,50, 0, 0));


        while(tama.gramy == true){
            tama.statystyki();
            tama.setNajedzenie(100);
            if(tama.nastroj< 50){
                if(pilki.size()>0){
                    pilki.get(0).uzyj(tama);
                    pilki.remove(0);
                }
            }
            if(tama.energia< 50){
                if(energetyki.size()>0){
                    energetyki.get(0).uzyj(tama);
                    energetyki.remove(0);
                }
            }
            tama.podsumowanie();
        }

    }

}
