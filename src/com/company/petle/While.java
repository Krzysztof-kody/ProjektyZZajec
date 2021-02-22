package com.company.petle;

public class While {
    public static void main(String[] args) {

        int i = 0;
        while ( i < 10){
            System.out.println(i);
            i++;
        }

        while (true){
            System.out.println(i);
            if( i > 10)
                break;
            i++;

        }


    }

}
