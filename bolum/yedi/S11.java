package bolum.yedi;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz.");

        int sinifMevcut = input.nextInt();
        double[] puanlar = new double[sinifMevcut];

        puanlariAta(input, puanlar);
        double ortalama = ortalamaHesapla(puanlar);
        double varyans = varyansBul(puanlar, ortalama);
        standartSapmaYazdir(varyans, puanlar , ortalama);
    }

    private static void standartSapmaYazdir(double varyans, double[] puanlar, double ortalama) {
        double standartSapma = Math.sqrt(varyans / (puanlar.length - 1));

        System.out.println("Sayıların ortalaması : " + (int)(ortalama * 100) / 100);
        System.out.println("Sayıların standar sapması " + (int)(standartSapma * 100) / 100);
    }

    private static double varyansBul(double[] puanlar, double ortalama) {
        double[] puanlarinKareleri = new double[puanlar.length];
        double toplam = 0;

        for (int i = 0; i < puanlar.length; i++){
            toplam += Math.pow((puanlar[i] - ortalama), 2);
        }
        return toplam;
    }

    private static double ortalamaHesapla(double[] puanlar) {
       double toplam = 0;

       for (int i = 0; i < puanlar.length; i++){
        toplam += puanlar[i];
       }
        return toplam / puanlar.length;
    }

    private static double[] puanlariAta(Scanner input, double[] puanlar) {
        System.out.println("Puanları giriniz.");
        for (int i = 0; i < puanlar.length; i++){
            puanlar[i] = input.nextDouble();
        }
        return puanlar;
    }
}
