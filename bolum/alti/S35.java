package bolum.alti;

import java.util.Scanner;

public class S35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = input.nextInt();

        System.out.println("Hane sayısını giriniz: ");
        int hane = input.nextInt();

        System.out.println( stringFormatGetir(sayi, hane));


    }

    private static String stringFormatGetir(int sayi, int hane) {

        String sayiString = String.valueOf(sayi);
        int sayiUzunuluk = sayiString.length();

        String sonuc = "";
        if (sayiUzunuluk >= hane) {
            return sayiString;
        } else {
            for (int i = 1; i <= hane - sayiUzunuluk; i++) {

                sonuc += "0";
            }
            return sonuc + sayiString;
        }
    }
}
