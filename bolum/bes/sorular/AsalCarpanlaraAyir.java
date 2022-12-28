package bolum.bes.sorular;

import java.util.Scanner;

public class AsalCarpanlaraAyir {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Asal çarpanlarına ayırmak istediğiniz bir sayı giriniz.");
        int sayi = klavye.nextInt();
        int bolen = 2;
        int bolunen = sayi;
        System.out.println(sayi + " asal çarpanları:");
        while (bolen < sayi) {
            if (bolunen % bolen == 0) {
                System.out.print(bolen + " ");
                bolunen /= bolen;
            } else {
                bolen++;
            }

        }


    }
}
