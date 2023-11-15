package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner4 {
    /**
     * Vize ve final notlar� girilsin. Dersten ge�ip ge�ilemedi�i
     * if-else ko�ulu ile kontrol edilsin.
     *
     */
    public static void main(String[] args) {

        // Kullan�c�dan vize ve final notlar�n� alal�m
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        double vizeNotu = scanner.nextDouble();

        System.out.print("Final notunu girin: ");
        double finalNotu = scanner.nextDouble();

        // Vize notunun %40'�, final notunun %60'� genel notu olu�tursun.
        double genelNot = (vizeNotu * 0.4) + (finalNotu * 0.6);
        System.out.println("Genel notunuz: " + genelNot);

        // Genel nota g�re ba�ar� durumunu kontrol edelim
        if (genelNot >= 50) {
            System.out.println("Tebrikler, dersi ge�tiniz!");
        } else {
            System.out.println("Maalesef, dersi ge�emediniz. Bir sonraki d�nemde ba�ar�lar dileriz.");
        }

    }
}
