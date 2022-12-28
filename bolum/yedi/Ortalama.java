package bolum.yedi;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ortalama alınması istediğiniz sayının adetini giriniz: ");

        int donguSayisi = input.nextInt();
        double [] dizi = new double[donguSayisi];
        double toplam = 0;

        for (int i = 0; i < donguSayisi; i++){
            System.out.println("Lütfen bir sayı giriniz: ");
            dizi[i] = input.nextDouble();
            toplam += dizi[i];
        }
        double ortalama = toplam / donguSayisi;
        System.out.println("Ortalama " + (int)ortalama);

        int ortalamadanBuyuklerSayaci = 0;
        for (int i = 0; i < donguSayisi; i++){
            if (dizi[i] > ortalama){
                System.out.print(dizi[i]);
                System.out.print(" - ");
                ortalamadanBuyuklerSayaci++;
            }
        }


        System.out.println("\nOrtalamadan büyük sayıların adeti : " + ortalamadanBuyuklerSayaci);


    }
}
