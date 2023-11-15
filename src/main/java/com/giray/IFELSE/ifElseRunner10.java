package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner10 {
    public static void main(String[] args) {


        /**
         * Kullan�c�dan ��genin kenar uzunluklar�n� alal�m ve ��genin
         * e�kenar, ikizkenar yada �e�itkenar oldu�unu bulal�m.
         * NOT=��genin 2 kenar toplam� 3. kenardan b�y�k olmak zorundad�r.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenar uzunlu�unu girin: ");
        int kenar1 = scanner.nextInt();

        System.out.print("�kinci kenar uzunlu�unu girin: ");
        int kenar2 = scanner.nextInt();

        System.out.print("���nc� kenar uzunlu�unu girin: ");
        int kenar3 = scanner.nextInt();


        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("E�kenar ��gen.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("�kizkenar ��gen.");
            } else {
                System.out.println("�e�itkenar ��gen.");
            }
        } else {
            System.out.println("Bu kenar uzunluklar�yla bir ��gen olu�turulamaz.");
        }

    }
}
