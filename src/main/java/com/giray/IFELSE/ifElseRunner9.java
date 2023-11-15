package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner9 {
    public static void main(String[] args) {
        /**
         * Kullan�c�dan girmesi istenilen ifadenin harf mi rakam m� yoksa
         * �zel karakter mi oldu�unu bulan uygulamay� yazal�m.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);


        if (Character.isLetter(karakter)) {
            System.out.println("Girilen karakter bir harftir.");
        } else if (Character.isDigit(karakter)) {
            System.out.println("Girilen karakter bir rakamd�r.");
        } else {
            System.out.println("Girilen karakter bir �zel karakterdir.");
        }
    }
}
