package bolum.yedi;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("10 adet sayı giriniz: ");

        int [] sayilar = new int[10];

        sayilariDiziyeAta(input, sayilar);

        int sayac = sayacGetir(sayilar);

        sayilariYazdir(sayilar, sayac);
    }

    private static void sayilariDiziyeAta(Scanner input, int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            int geciciSayi = input.nextInt();
            for (int j = 0; j < sayilar.length; j++){
                if (sayilar[j] == geciciSayi) {
                    break;
                }
                if (j == 9) {
                    sayilar[i] = geciciSayi;
                }
            }
        }
    }

    private static int sayacGetir(int[] sayilar) {
        int sayac = 0;
        for (int k = 0; k < sayilar.length; k++){
            if (sayilar[k] != 0){
                sayac++;
            }
        }
        return sayac;
    }

    public static void sayilariYazdir(int[] sayilar, int sayac) {
        System.out.println("Tekrar etmeyen sayı adeti : " + sayac);
        System.out.print("Tekrat etmeyen sayılar: ");
        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] != 0){
                System.out.print(sayilar[i] + "  ");
            }
        }
    }
}
