package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner6 {
    public static void main(String[] args) {
        /**
         * Kullan�c�dan al�nan not bilgisi ile notun hangi harfe kar��l�k geldi�ini bulal�m.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu girin: ");
        int not = scanner.nextInt();


        if (not >= 90 && not <= 100) {
            System.out.println("Harf notunuz: AA");
        } else if (not >= 80 && not < 90) {
            System.out.println("Harf notunuz: BA");
        } else if (not >= 70 && not < 80) {
            System.out.println("Harf notunuz: BB");
        } else if (not >= 60 && not < 70) {
            System.out.println("Harf notunuz: CB");
        } else if (not >= 50 && not < 60) {
            System.out.println("Harf notunuz: CC");
        } else if (not >= 0 && not < 50) {
            System.out.println("Harf notunuz: FF");
        } else {
            System.out.println("Ge�ersiz not giri�i. L�tfen 0-100 aras�nda bir not girin.");
        }
    }
}
