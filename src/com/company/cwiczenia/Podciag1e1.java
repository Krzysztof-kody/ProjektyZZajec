package com.company.cwiczenia;

public class Podciag1e1 {

    public static void main(String[] args){
        String s = "rmbcjjjjsadjakhsdkaaaaax";
        int j = 0;
        int dl = 1;
        int dlMax = 0;
        int posMax = 0;
       //  1 1 1 1 4 1 1 1 1 1 1 1 1 1 1 5 1

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dl++;
            }
            else {
                if(dl > dlMax){
                    dlMax = dl;
                    posMax = j;
                }
                System.out.println(j + " " + dl);
                dl = 1;

                j = i+1;
            }
        }
        System.out.println(j + " " + dl);
        if(dl > dlMax) {
            dlMax = dl;
            posMax = j;
        }
        System.out.println("Max: " + posMax+ ":"+ dlMax);
        for(){

        }
    }
}
