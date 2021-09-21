package com.ismailgunduz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tutar, oranKDV;

        System.out.print("Tutar giriniz\n--> ");
        tutar = s.nextDouble();
        if (tutar <= 1000) {
            oranKDV = 0.18;
        } else {
            oranKDV = 0.08;
        }
        double kdv = tutar * oranKDV;
        double toplam = tutar + kdv;

        System.out.println("KDV haric tutar: " + tutar);
        System.out.println("KDV: " + kdv);
        System.out.println("KDV dahil tutar: " + toplam);
    }
}
