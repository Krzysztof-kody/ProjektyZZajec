package com.company.petle;

public class While {
    public static void main(String[] args) {

        /*

        pętla while jest podstawową pętlą, posiada warunek,
        który musi być spełniony by pętla się powtarzała.
        Jeżeli warunek nie będzie spełniony (false) to pętla
        ulegnie przerwaniu

         */

        int i = 0;
        while ( i < 10){
            System.out.println(i);
            i++;
        }

        /*

        pętlę while można wykorzystać jako nieskończoną pętlę,
        którą przerywa się w pewnych okolicznościach. W tym
        przypadku gdy i będzie mniejsze niż 1.

         */

        while (true){
            System.out.println(i);
            if( i < 1 )
                break;
            i--;
        }


    }

}
