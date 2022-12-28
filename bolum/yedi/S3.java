package bolum.yedi;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tekrar sayısını öğrenmek istediğiniz sayıları giriniz.\n Sayılar: ");

        int[] sayilar = new int[100];

        diziElemanAta(input, sayilar);
        java.util.Arrays.sort(sayilar);
        diziYazdir(sayilar);
    }

    public static void diziYazdir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            int tekrarSayaci = 0;
            for (int j = 0; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]){
                    tekrarSayaci++;
                }
            }
            System.out.println(sayilar[i] + " sayısının tekrarı " + tekrarSayaci + " keredir");
        }
    }

    public static int [] diziElemanAta(Scanner input, int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            sayilar[i] = input.nextInt();
        }
        return sayilar;
    }
}
