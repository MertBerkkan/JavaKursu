package bolum.bes.sorular;

import java.util.Scanner;

public class EnYuksekPuaniAlaniBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Toplam öğrenci sayısını giriniz.");
        int toplamOgrenci = input.nextInt();
        int sayac = 0;
        String ogrenciAdi = "";
        String dusukOgranciAdi = "";
        int enYuksekPuan = 0;
        int enDusukPuan = 100;
        int toplam = 0;
        int ortalama = 0;
        while (sayac < toplamOgrenci) {
            System.out.println("öğrenci adını giriniz.");
            String isim = input.next();
            System.out.println("puan giriniz.");
            int puan = input.nextInt();
            if (puan >= enYuksekPuan) {
                enYuksekPuan = puan;
                ogrenciAdi = isim;
            }

            if (puan <= enDusukPuan) {
                enDusukPuan = puan;
                dusukOgranciAdi = isim;
            }
            toplam += puan;
            ortalama = toplam / toplamOgrenci;
            sayac++;
        }
        System.out.println("En yüksek puanı alan öğrenci: " + ogrenciAdi + "   puanı: " + enYuksekPuan);
        System.out.println("En düşük puanı alan öğrenci: " + dusukOgranciAdi + "   puanı: " + enDusukPuan);
        System.out.println("Sınıfın puan ortalaması : " + ortalama);
    }
}

