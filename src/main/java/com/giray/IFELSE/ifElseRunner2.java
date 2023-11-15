package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner2 {
    public static void main(String[] args) {

        /**
         * Girilen sayýnýn tek mi çift mi olduðunu veren uygulamayý yapalým.
         */

        int sayi1;
        System.out.println("Lütfen bir sayý giriniz...");
        sayi1=new Scanner(System.in).nextInt();
        if (sayi1%2!=0){
            System.out.println("Sayý Tektir..");
        }
        else{
            System.out.println("Sayý Çifttir.");
        }
    }
}
