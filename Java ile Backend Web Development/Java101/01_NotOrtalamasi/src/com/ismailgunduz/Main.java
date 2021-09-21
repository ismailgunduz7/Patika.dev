package com.ismailgunduz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ortalama = 0;

        System.out.print("Matematik notunu girin:\n--> ");
        ortalama += s.nextInt();

        System.out.print("Fizik notunu girin:\n--> ");
        ortalama += s.nextInt();

        System.out.print("Kimya notunu girin:\n--> ");
        ortalama += s.nextInt();

        System.out.print("Turkce notunu girin:\n--> ");
        ortalama += s.nextInt();

        System.out.print("Tarih notunu girin:\n--> ");
        ortalama += s.nextInt();

        System.out.print("Muzik notunu girin:\n--> ");
        ortalama += s.nextInt();

        ortalama /= 6;
        System.out.println("Not ortalamaniz: " + String.format("%.2f", ortalama));

        boolean gecti = ortalama >= 60;
        System.out.println(gecti ? "Sinifi gectiniz." : "Sinifta kaldiniz.");
    }
}
