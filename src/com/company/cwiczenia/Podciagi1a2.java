package com.company.cwiczenia;

public class Podciagi1a2 {
    public static void main(String[] args){
        String s = "sajgsjdfgjgwiuyewrmbcjjjjjjsadjakhsdkaaaaaaa";
        int dl = 1;
        int dlMax=0;
        int posMax = 0;
        int a = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                dl++;
            }
            else
            {
                if(dl>dlMax){
                    dlMax = dl;
                    posMax = i;
                }
                dl = 1;
            }
            if(i+1 == s.length()){
                if(dl>dlMax){
                    dlMax = dl;
                    posMax = s.length();
                }
            }
        }
        System.out.println(dlMax);
        for(int i = posMax-dlMax; i< posMax; i++){
            System.out.print(s.charAt(i));
        }
    }
}
