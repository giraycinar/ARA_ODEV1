package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner3 {
    public static void main(String[] args) {

        /**
         * Bir art�k y�l hesaplama uygulamas� yapal�m.
         * Art�k y�llar 4 �n kat� olan y�llard�r. Ancak 100 �n kat� olan y�llardan sadece
         * 400 e kalans�z b�l�nebilenler art�k y�ld�r.
         */
        //Kontrol edilecek y�l
        int yil ;
        System.out.println("L�tfen bir y�l giriniz...");
        yil=new Scanner(System.in).nextInt();


        if((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0)))
            System.out.println( yil + " y�l� art�k bir y�ld�r.");
        else
            System.out.println( yil + " y�l� art�k y�l de�ildir.");


    }
}
