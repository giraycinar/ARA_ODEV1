package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner1 {
    public static void main(String[] args) {

        /**
         * Kullanýcýdan alýnan sayýlarýn büyük, küçük, eþit olma durumalrýný inceleyen bir uygulama yapalým.
         */

        int s1 ;
        int s2 ;
        System.out.println("Lütfen 1. sayýnýzý giriniz...");
        s1 = new Scanner(System.in).nextInt();
        System.out.println("Lütfen 2. sayýnýzý giriniz...");
        s2 = new Scanner(System.in).nextInt();

        if(s1 > s2){
            System.out.println(s1 + " büyüktür " + s2+ " sayýsýndan");
        }
        else if(s1 < s2){
            System.out.println(s1 + " küçüktür " + s2+ " sayýsýndan");
        }
        else{
            System.out.println(s1 + " eþittir " + s2);
        }
    }
    }

