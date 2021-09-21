package com.ismailgunduz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dik1, dik2;
        double hipotenus;

        System.out.print("1. dik kenarin uzunlugunu giriniz\n--> ");
        dik1 = s.nextInt();

        System.out.print("2. dik kenarin uzunlugunu giriniz\n--> ");
        dik2 = s.nextInt();

        hipotenus = Math.sqrt(Math.pow(dik1, 2) + Math.pow(dik2, 2));
        System.out.printf("Dik kenarlari %d ve %d olan ucgenin hipotenus uzunlugu: %.1f", dik1, dik2, hipotenus);

        System.out.println();

        int kenar1, kenar2, kenar3;
        System.out.print("Kenar uzunlugu (1/3)\n--> ");
        kenar1 = s.nextInt();
        System.out.print("Kenar uzunlugu (2/3)\n--> ");
        kenar2 = s.nextInt();
        System.out.print("Kenar uzunlugu (3/3)\n--> ");
        kenar3 = s.nextInt();

        int u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.printf("Kenar uzunluklari %d, %d ve %d olan ucgenin alani: %.2f", kenar1, kenar2, kenar3, alan);
    }
}
