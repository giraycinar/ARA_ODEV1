package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner8 {
    public static void main(String[] args) {
        /**
         * Kullan�c�dan 3 say� giri�i al�p s�ralayan bir uygulama.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci say�y� girin: ");
        int num1 = scanner.nextInt();

        System.out.print("�kinci say�y� girin: ");
        int num2 = scanner.nextInt();

        System.out.print("���nc� say�y� girin: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("En b�y�k say�: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("En b�y�k say�: " + num2);
        } else {
            System.out.println("En b�y�k say�: " + num3);
        }
    }
}
