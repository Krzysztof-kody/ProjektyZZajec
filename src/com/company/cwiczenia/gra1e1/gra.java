package com.company.cwiczenia.gra1e1;

import java.util.ArrayList;

public class gra {


    public static void main(String[] args){
        Stworek st = new Stworek("Kulek");
        st.statystyki();
        ArrayList<Przedmiot> apteczki = new ArrayList<>();
        apteczki.add(new Przedmiot("apteczka",50,0,0,0));

        while(st.zywy) {
            if(st.getZdrowie() < 50){
                if(apteczki.size() > 0) {
                    apteczki.get(0).uzyj(st);
                    apteczki.remove(0);
                }
            }
            st.setSytosc(30);
            st.statystyki();
            System.out.println("---------");
        }
    }
}
