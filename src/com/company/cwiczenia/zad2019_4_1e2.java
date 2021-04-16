package com.company.cwiczenia;

public class zad2019_4_1e2 {
    static boolean czyPotega3(int n){
        while(n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }

    // psvm
    public static void main(String[] args) {
      int n = 729;
      int k = 11;
      int[] potegi = new int[k];
      if(czyPotega3(n))
          System.out.println("tak");
      else
          System.out.println("nie");
//------------------------------------------------------------
      for(int i = 1, j = 0; i <= 100000; i= i*3, j++) {
          potegi[j] = i;
          System.out.println(j + ". " + i);
      }
      boolean czy = false;
      for(int pot: potegi) {
          if (pot == n) {
              czy = true;
              break;
          }
          }
      if(czy)
          System.out.println("tak");
      else
          System.out.println("nie");
      }

    }

