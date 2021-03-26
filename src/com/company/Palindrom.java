package com.company;

public class Palindrom {

    public static void main(String[] args){
        String s1 = "aaaabbbaaaa";
        String s2 = "";
        for(int i = s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);
        }
        System.out.println(s1 + " ? " + s1);
        if(s1.equals(s2)){
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Nie palindrom");
        }

    }

}
