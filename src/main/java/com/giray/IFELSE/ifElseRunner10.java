package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner10 {
    public static void main(String[] args) {


        /**
         * Kullanıcıdan üçgenin kenar uzunluklarını alalım ve üçgenin
         * eşkenar, ikizkenar yada çeşitkenar olduğunu bulalım.
         * NOT=Üçgenin 2 kenar toplamı 3. kenardan büyük olmak zorundadır.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu girin: ");
        int kenar1 = scanner.nextInt();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        int kenar3 = scanner.nextInt();


        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Eşkenar üçgen.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("İkizkenar üçgen.");
            } else {
                System.out.println("Çeşitkenar üçgen.");
            }
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }

    }
}
