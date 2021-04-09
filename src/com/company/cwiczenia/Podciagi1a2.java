package com.company.cwiczenia;

public class Podciagi1a2 {
    public static void main(String[] args){
        String s = "sajgsjdfgjgwiuyewrmbcjjjjjjsadjakhsdkaaaaa";
        int dl = 1;
        int dlMax=0;
        for(int i = 1; i < s.length(); i++){

            if(s.charAt(i) == s.charAt(i-1)){
                dl++;
            }
            else
            {
                if(dl>dlMax){
                    dlMax = dl;
                }
                dl = 1;
            }
            if(i+1 == s.length()){
                if(dl>dlMax){
                    dlMax = dl;
                }
            }
        }
        System.out.println(dlMax);
    }
}
