package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner3 {
    public static void main(String[] args) {

        /**
         * Bir artýk yýl hesaplama uygulamasý yapalým.
         * Artýk yýllar 4 ün katý olan yýllardýr. Ancak 100 ün katý olan yýllardan sadece
         * 400 e kalansýz bölünebilenler artýk yýldýr.
         */
        //Kontrol edilecek yýl
        int yil ;
        System.out.println("Lütfen bir yýl giriniz...");
        yil=new Scanner(System.in).nextInt();


        if((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0)))
            System.out.println( yil + " yýlý artýk bir yýldýr.");
        else
            System.out.println( yil + " yýlý artýk yýl deðildir.");


    }
}
