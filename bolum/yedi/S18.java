package bolum.yedi;

import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------Girilen sayıların olası ikili kombinasyonlarını bulma.-------");

        System.out.print("Kaç adet sayı gireceğinizi giriniz:");

        int mevcut = input.nextInt();
        int[] sayilar = new int[mevcut];

        diziAta(input, sayilar);
        kombinasyonuYazdir(sayilar);


    }

    public static void kombinasyonuYazdir(int[] sayilar) {
        int sayac = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 1; j < sayilar.length; j++) {
                if (i != j) {
                    if (sayac + 1 % 10 == 0) {
                        System.out.println();
                    }
                    System.out.print("[" + sayilar[i] + "-" + sayilar[j] + "]");
                    sayac++;
                }
            }
        }
    }

    public static void diziAta(Scanner input, int[] sayilar) {
        System.out.println("\n Sayıları giriniz:");

        for (int i = 0; i < sayilar.length; i++){
            sayilar[i] = input.nextInt();
        }
    }
}
