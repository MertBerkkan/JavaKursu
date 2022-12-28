package bolum.alti;

import java.util.Scanner;

public class S25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz milisaniyeyi giriniz.");
        System.out.print("Milisaniye: ");
        long miliSaniye = input.nextLong();

        System.out.println(msCevir(miliSaniye));
    }

    private static String msCevir(long miliSaniye) {

        long toplamSaniye = miliSaniye / 1000;
        long saniye = toplamSaniye % 60;
        long toplamDakika = toplamSaniye / 60;
        long dakika = toplamDakika % 60;
        long saat = toplamDakika / 60;

        return saat + ":" + dakika + ":" + saniye;
    }
}
