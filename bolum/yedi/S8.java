package bolum.yedi;

import java.util.Scanner;

public class S8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] sayilar = new int[10];

        System.out.println("10 adet sayı giriniz.");

        sayilariAta(input, sayilar);
        int ortalamaInt = ortalamaIntGetir(sayilar);
        ortalamaYazdir(ortalamaInt, sayilar);
        double ortalamaDouble = ortalamaDoubleGetir(sayilar);
        ortalamaYazdirDouble(ortalamaDouble, sayilar);

    }
    public static void ortalamaYazdirDouble(double ortalama , int [] sayilar) {

        for (int i = 0; i < sayilar.length; i++){
            System.out.print(sayilar[i] + " - ");
        }
        System.out.println("\nSayılarının ortalaması(double)" + ortalama + "\n");
    }
    public static void ortalamaYazdir(int ortalama , int [] sayilar) {

        for (int i = 0; i < sayilar.length; i++){
            System.out.print(sayilar[i] + " - ");
        }
        System.out.println("\nSayılarının ortalaması(int)" + ortalama + "\n");
    }

    public static double ortalamaDoubleGetir(int[] sayilar) {
        double toplam = 0;

        for (int i = 0; i < sayilar.length; i++){
            toplam += sayilar[i];
        }
        return toplam / sayilar.length;
    }

    public static int ortalamaIntGetir(int[] sayilar) {
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++){
            toplam += sayilar[i];
        }
        return toplam / sayilar.length;
    }

    public static void sayilariAta(Scanner input, int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            sayilar[i] = input.nextInt();
        }
    }
}
