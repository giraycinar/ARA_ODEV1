package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner5 {
    public static void main(String[] args) {

        /**
         * Kullan�c�dan say� giri�i alarak negatif, pozitifli�i kontrol edelim.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir say� girin: ");
        int number = scanner.nextInt();


        if (number > 0) {
            System.out.println("Girilen say� pozitif.");
        } else if (number < 0) {
            System.out.println("Girilen say� negatif.");
        } else {
            System.out.println("Girilen say� s�f�rd�r.");
        }
    }
}
