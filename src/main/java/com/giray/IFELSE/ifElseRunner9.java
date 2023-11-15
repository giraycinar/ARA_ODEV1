package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner9 {
    public static void main(String[] args) {
        /**
         * Kullanýcýdan girmesi istenilen ifadenin harf mi rakam mý yoksa
         * özel karakter mi olduðunu bulan uygulamayý yazalým.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);


        if (Character.isLetter(karakter)) {
            System.out.println("Girilen karakter bir harftir.");
        } else if (Character.isDigit(karakter)) {
            System.out.println("Girilen karakter bir rakamdýr.");
        } else {
            System.out.println("Girilen karakter bir özel karakterdir.");
        }
    }
}
