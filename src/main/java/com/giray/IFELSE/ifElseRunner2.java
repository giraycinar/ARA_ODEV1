package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner2 {
    public static void main(String[] args) {

        /**
         * Girilen say�n�n tek mi �ift mi oldu�unu veren uygulamay� yapal�m.
         */

        int sayi1;
        System.out.println("L�tfen bir say� giriniz...");
        sayi1=new Scanner(System.in).nextInt();
        if (sayi1%2!=0){
            System.out.println("Say� Tektir..");
        }
        else{
            System.out.println("Say� �ifttir.");
        }
    }
}
