package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner7 {
    public static void main(String[] args) {
        /** Kullanıcıdan bir ay numarası girişi alalım
         * 1-Ocak, 2-Şubat, 3-Mart, 4-Nisan, 5-Mayıs, 6-Haziran,
         * 7-Temmuz, 8-Ağustos, 9-Eylül, 10-Ekim, 11-Kasım, 12-Aralık.
         * Ve mevsimleri yazdıran bir program yapalım.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ay numarası girin (1-12): ");
        int ay = scanner.nextInt();


        if (ay >= 1 && ay <= 12) {
            if (ay >= 3 && ay <= 5) {
                System.out.println("Bahar");
            } else if (ay >= 6 && ay <= 8) {
                System.out.println("Yaz");
            } else if (ay >= 9 && ay <= 11) {
                System.out.println("Sonbahar");
            } else {
                System.out.println("Kış");
            }
        } else {
            System.out.println("Geçersiz ay numarası. Lütfen 1-12 arasında bir sayı girin.");
        }
    }
}
