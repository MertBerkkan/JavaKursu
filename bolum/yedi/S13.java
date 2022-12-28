package bolum.yedi;

import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 10 adet sayı giriniz.");

        int [] sayilar = new int[10];

        sayilariAta(input, sayilar);
        sayilariSirala(sayilar);
        sayilariYazdir(sayilar);

    }

    private static void sayilariYazdir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            System.out.print(" " + sayilar[i]);
        }
    }

    private static void sayilariSirala(int[] sayilar) {

        int gecici = 0;
        int mevcut = sayilar.length;
        for (int i = 0; i < mevcut; i++){
            for (int j = 1;j < mevcut; j++)
                if (sayilar[j - 1] < sayilar[j]) {
                    gecici = sayilar[j - 1];
                    sayilar[j - 1] = sayilar[j];
                    sayilar[j] = gecici;
                }
        }

    }

    private static void sayilariAta(Scanner input, int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            sayilar[i] = input.nextInt();
        }
    }


}
