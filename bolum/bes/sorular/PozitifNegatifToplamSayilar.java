package bolum.bes.sorular;

import java.util.Scanner;

public class PozitifNegatifToplamSayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz, bitirmek için 0 giriniz.");
        int sayi = input.nextInt();
        int sayac = 0;
        int toplam = 0;
        int pozitif = 0;
        int negatif = 0;

        while (sayi != 0) {
            toplam += sayi;
            sayi = input.nextInt();

            if (sayi > 0) {
                pozitif++;
            } else {
                negatif++;
            }

            sayac++;
        }
        if (sayac == 0){
            System.out.print("Programdan çıkılıyor.");
            return;
        }
        System.out.println("Pozitif sayılar: " + pozitif);
        System.out.println("Negatif sayılar: " + negatif);
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + (toplam / sayac));

    }

}
