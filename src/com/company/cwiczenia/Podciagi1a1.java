package com.company.cwiczenia;

public class Podciagi1a1 {

    public static void main(String[] args){
        String ciag = "lhffffggffffskdfsssssejfksdhfsssssaksjhdaaaaaaah";
        int dlMax = 0;
        int dl=0;
        int j=0;
        int posMax=0;

        for(int i = 0; i < ciag.length(); i++ ){
            if(ciag.charAt(i) == ciag.charAt(j))
                dl++;
            else {
                if (dl > dlMax) {
                    dlMax = dl;
                    posMax = j;
                }
                j = i;
                dl = 1;
            }
        }
        System.out.println(dlMax + ", " + posMax);
        for(int i = posMax; i < posMax+dlMax; i++){
            System.out.print(ciag.charAt(i));
        }
    }
}
