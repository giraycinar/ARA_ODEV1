package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner5 {
    public static void main(String[] args) {

        /**
         * Kullanýcýdan sayý giriþi alarak negatif, pozitifliði kontrol edelim.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayý girin: ");
        int number = scanner.nextInt();


        if (number > 0) {
            System.out.println("Girilen sayý pozitif.");
        } else if (number < 0) {
            System.out.println("Girilen sayý negatif.");
        } else {
            System.out.println("Girilen sayý sýfýrdýr.");
        }
    }
}
