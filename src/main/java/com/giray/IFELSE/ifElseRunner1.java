package com.giray.IFELSE;

import java.util.Scanner;

public class ifElseRunner1 {
    public static void main(String[] args) {

        /**
         * Kullan�c�dan al�nan say�lar�n b�y�k, k���k, e�it olma durumalr�n� inceleyen bir uygulama yapal�m.
         */

        int s1 ;
        int s2 ;
        System.out.println("L�tfen 1. say�n�z� giriniz...");
        s1 = new Scanner(System.in).nextInt();
        System.out.println("L�tfen 2. say�n�z� giriniz...");
        s2 = new Scanner(System.in).nextInt();

        if(s1 > s2){
            System.out.println(s1 + " b�y�kt�r " + s2+ " say�s�ndan");
        }
        else if(s1 < s2){
            System.out.println(s1 + " k���kt�r " + s2+ " say�s�ndan");
        }
        else{
            System.out.println(s1 + " e�ittir " + s2);
        }
    }
    }

