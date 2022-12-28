package bolum.yedi;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz.");
        int ogrenciSayisi = input.nextInt();

        int[] puanlar = new int[ogrenciSayisi];

        System.out.println("Öğrencilerin puanları bir boşluk bırakarak giriniz.");

        int enYuksekPuan = 0;
        for (int i = 0; i < ogrenciSayisi; i++) {
            puanlar[i] = input.nextInt();
            if (enYuksekPuan < puanlar[i]) {
                enYuksekPuan = puanlar[i];
            }
        }
        notYazdir(ogrenciSayisi, puanlar, enYuksekPuan);
    }

    public static void notYazdir(int ogrenciSayisi, int[] puanlar, int enYuksekPuan) {
        for (int i = 0; i < ogrenciSayisi; i++) {
            if (puanlar[i] >= (enYuksekPuan - 10)) {
                System.out.println(i + " numaralı öğrencinin notu : A");
            } else if (puanlar[i] >= (enYuksekPuan - 20)) {
                System.out.println(i + " numaralı öğrencinin notu : B");
            } else if (puanlar[i] >= (enYuksekPuan - 30)) {
                System.out.println(i + " numaralı öğrencinin notu : C");
            } else if (puanlar[i] >= (enYuksekPuan - 40)) {
                System.out.println(i + " numaralı öğrencinin notu : D");
            }else {
                System.out.println(i + " numaralı öğrencinin notu : F");
            }
        }
    }
}
