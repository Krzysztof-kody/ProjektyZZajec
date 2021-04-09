package com.company.cwiczenia;

public class Podciagi1e2 {
    public static void main(String[] args){
        String s = "assssssssssssabddddabcccxxxxxxxxxxxxxxxx";
        int dl = 1;
        int dlMax = 0;
        int posMax = 0;
        int pos = 0;
        for(int i = 0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                dl++;
            else {
                System.out.println(dl);
                if(dl > dlMax) {
                    dlMax = dl;
                    posMax = pos;
                }
                pos += dl;
                dl = 1;
            }
        }
        System.out.println(dl);
        if(dl > dlMax) {
            dlMax = dl;
            posMax = pos;
        }
        System.out.println(dlMax + ": " + posMax);
        for(int i = posMax; i <posMax+dlMax; i++){
            System.out.print(s.charAt(i));
        }
    }
}
