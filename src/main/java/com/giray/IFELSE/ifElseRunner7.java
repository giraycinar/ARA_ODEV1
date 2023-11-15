package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner7 {
    public static void main(String[] args) {
        /** Kullan�c�dan bir ay numaras� giri�i alal�m
         * 1-Ocak, 2-�ubat, 3-Mart, 4-Nisan, 5-May�s, 6-Haziran,
         * 7-Temmuz, 8-A�ustos, 9-Eyl�l, 10-Ekim, 11-Kas�m, 12-Aral�k.
         * Ve mevsimleri yazd�ran bir program yapal�m.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ay numaras� girin (1-12): ");
        int ay = scanner.nextInt();


        if (ay >= 1 && ay <= 12) {
            if (ay >= 3 && ay <= 5) {
                System.out.println("Bahar");
            } else if (ay >= 6 && ay <= 8) {
                System.out.println("Yaz");
            } else if (ay >= 9 && ay <= 11) {
                System.out.println("Sonbahar");
            } else {
                System.out.println("K��");
            }
        } else {
            System.out.println("Ge�ersiz ay numaras�. L�tfen 1-12 aras�nda bir say� girin.");
        }
    }
}
