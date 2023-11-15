package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner8 {
    public static void main(String[] args) {
        /**
         * Kullanýcýdan 3 sayý giriþi alýp sýralayan bir uygulama.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayýyý girin: ");
        int num1 = scanner.nextInt();

        System.out.print("Ýkinci sayýyý girin: ");
        int num2 = scanner.nextInt();

        System.out.print("Üçüncü sayýyý girin: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("En büyük sayý: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("En büyük sayý: " + num2);
        } else {
            System.out.println("En büyük sayý: " + num3);
        }
    }
}
