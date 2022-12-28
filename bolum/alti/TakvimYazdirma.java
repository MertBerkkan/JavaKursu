package bolum.alti;

import java.util.Scanner;

public class TakvimYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir yıl giriniz.(Or. 1997); ");
        int yil = input.nextInt();

        System.out.print("Lütfen 1 ile 12 arasında olacak şekilde ay giriniz: ");
        int ay = input.nextInt();

        takvimYazdir(yil, ay);
    }

    private static void takvimYazdir(int yil, int ay) {
        takvimBasligiYazdir(yil, ay);
        takvimGovdeYazdir(yil, ay);
    }

    private static void takvimBasligiYazdir(int yil, int ay) {
        String ayAdi = ayinAdiniBul(ay);

        System.out.println("     " + ayAdi + " " + yil);
        System.out.println("----------------------------");
        System.out.println(" Pzt Sal Çar Per Cum Cmt Paz");
    }

    private static String ayinAdiniBul(int ay) {
        switch (ay){
            case 1 :
                return "Ocak";
            case 2 :
                return "Şubat";
            case 3 :
                return "Mart";
            case 4 :
                return "Nisan";
            case 5 :
                return "Mayıs";
            case 6 :
                return "Haziran";
            case 7 :
                return "Temmuz";
            case 8 :
                return "Ağustos";
            case 9 :
                return "Eylül";
            case 10 :
                return "Ekim";
            case 11 :
                return "Kasım";
            case 12 :
                return "Aralık";
            default:
                return "";
        }
    }


    private static void takvimGovdeYazdir(int yil, int ay) {
        int baslangicGunu = baslangicGununuBul(yil, ay);

        int aydakiGunSayisi = birAydakiGunSayisiniBul(yil, ay);

        for (int i = 0; i < baslangicGunu; i++){
            System.out.print("    ");
        }

        for (int i = 1; i <= aydakiGunSayisi; i++){
            System.out.printf("%4d", i);
            baslangicGunu++;
            if (baslangicGunu % 7 == 0){
                System.out.println();
            }
        }

    }
    private static int baslangicGununuBul(int yil, int ay) {
        final int ocak1Yil1800Gunu = 2;
        int toplamGun = toplamGunSayisiniBul(yil, ay);

        return (toplamGun + ocak1Yil1800Gunu) % 7;
    }

    private static int toplamGunSayisiniBul(int yil, int ay) {
        int toplamGun = 0;

        for (int i = 1800; i < yil; i++){
            toplamGun += artikYilMi(i) ? 366 : 365;
        }

        for (int i = 1; i < ay; i++){
            toplamGun += birAydakiGunSayisiniBul(yil, i);
        }
        return toplamGun;
    }

    private static int birAydakiGunSayisiniBul(int yil, int ay) {
        if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12){
            return 31;
        }
        if (ay == 4 ||ay == 6 ||ay == 9 ||ay == 11){
            return 30;
        }
        if (ay == 2){
            return artikYilMi(yil) ? 29 : 28;
        }
        return 0;
    }

    private static boolean artikYilMi(int yil){
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }


}


