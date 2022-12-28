package bolum.alti;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");

        int sayi = input.nextInt();

        if (sayi < 0) {
            sayi *= -1;
        }

        System.out.println("Basamakların toplamı : " + basamakToplami(sayi));
    }

    private static int basamakToplami(int i) {
        int toplam = 0;
        while (i > 0) {

            toplam += i % 10;
            i /= 10;
        }
        return toplam;
    }

}
