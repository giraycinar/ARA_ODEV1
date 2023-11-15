package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner4 {
    /**
     * Vize ve final notlarý girilsin. Dersten geçip geçilemediði
     * if-else koþulu ile kontrol edilsin.
     *
     */
    public static void main(String[] args) {

        // Kullanýcýdan vize ve final notlarýný alalým
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        double vizeNotu = scanner.nextDouble();

        System.out.print("Final notunu girin: ");
        double finalNotu = scanner.nextDouble();

        // Vize notunun %40'ý, final notunun %60'ý genel notu oluþtursun.
        double genelNot = (vizeNotu * 0.4) + (finalNotu * 0.6);
        System.out.println("Genel notunuz: " + genelNot);

        // Genel nota göre baþarý durumunu kontrol edelim
        if (genelNot >= 50) {
            System.out.println("Tebrikler, dersi geçtiniz!");
        } else {
            System.out.println("Maalesef, dersi geçemediniz. Bir sonraki dönemde baþarýlar dileriz.");
        }

    }
}
