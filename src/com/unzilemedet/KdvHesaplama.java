package com.unzilemedet;

import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {


            double kdvOrani, kdvTutari, kdvliFiyat, kdvSizFiyat;
            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen fiyatı giriniz: ");
            double fiyat = input.nextDouble();

            if (fiyat > 0 && fiyat <= 1000) {
                kdvOrani = 0.18;
            } else {
                kdvOrani = 0.08;
            }

            kdvTutari = fiyat * kdvOrani;
            kdvliFiyat = fiyat + kdvTutari;
            kdvSizFiyat = fiyat;

            System.out.println("KDV'siz Fiyat: " + kdvSizFiyat);
            System.out.println("KDV Oranı: %" + (kdvOrani * 100));
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}