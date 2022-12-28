package bolum.bes.sorular;

import java.util.Scanner;

public class S45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("10 adet sayı giriniz.(Sayı girme işleminiz bittiğinide 0 ile noktalandırınız.)");
        double sayi = input.nextInt();
        double sayac = 0;
        double toplam = 0;
        double ortalama = 0;
        double standartSapma = 0;
        while (sayi != 0) {
            toplam += sayi;
            sayi = input.nextInt();

            sayac++;
            ortalama = toplam / sayac;
            double kok = Math.sqrt(sayi - ortalama);
            if (sayac == 10) {
                sayac++;
                for (int sayacSapma = 0, toplamKarekok = 0; sayacSapma <= 10; sayacSapma++) {

                    toplamKarekok += kok;
                    standartSapma = Math.sqrt(toplamKarekok / 9);
                }
                System.out.println("Sayıların standart sapması : " + standartSapma);

            }
        }
    }
}

