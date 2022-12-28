package bolum.yedi;

import java.util.Scanner;

public class S3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] sayilar = new int[100];

        System.out.println("Sayıları giriniz.");

        int guncelSayi = 0;
        do {
            guncelSayi = input.nextInt();

            if (guncelSayi != 0){
                sayilar[guncelSayi - 1]++;
            }
        }while (guncelSayi != 0);

        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] != 0){
                System.out.println(i+1 + " sayısı " + sayilar[i] + " kere tekrar eder.");
            }
        }
    }
}
