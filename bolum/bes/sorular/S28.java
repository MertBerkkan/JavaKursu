package bolum.bes.sorular;

import java.util.Scanner;

public class S28 {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int yil = klavye.nextInt();

        if (yil <= 0){
            System.out.println("Hata : 0'dan sonraki yılları girin.");
            System.exit(0);
        }

        System.out.println("Yılın ilk gününü giriniz.(Pazartesi : 1 - Salı : 2 vb.");
        int gun = klavye.nextInt();

        if (gun < 0){
            System.out.println("Hata : 1-7 arasında bir sayı giriniz.");
            System.exit(1);
        }

        String gunAdi;
        String ayAdi;

        for (int ay = 1; ay <= 12; ay++){
            switch (ay){
                case 1 : ayAdi = "Ocak"; break;
                case 2 : ayAdi = "Şubat"; break;
                case 3 : ayAdi = "Mart"; break;
                case 4 : ayAdi = "Nisan"; break;
                case 5 : ayAdi = "Mayıs"; break;
                case 6 : ayAdi = "Haziran"; break;
                case 7 : ayAdi = "Temmuz"; break;
                case 8 : ayAdi = "Ağustos"; break;
                case 9 : ayAdi = "Eylül"; break;
                case 10 : ayAdi = "Ekim"; break;
                case 11 : ayAdi = "Kasım"; break;
                default : ayAdi = "Aralık";
            }
            switch (gun){
                case 1 : gunAdi = "Pazartesi"; break;
                case 2 : gunAdi = "Salı"; break;
                case 3 : gunAdi = "Çarşamba"; break;
                case 4 : gunAdi = "Perşembe"; break;
                case 5 : gunAdi = "Cuma"; break;
                case 6 : gunAdi = "Cumartesi"; break;
                default: gunAdi = "Pazar";
            }

            System.out.println(ayAdi + " 1, " + yil + " " + gunAdi + "'dır.");

            if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
                gun = (1 + (gun + 30) % 7);
            }else if (ay == 2){
                    if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)){
                    gun = (1 + (gun + 28) % 7);
                    }else {
                    gun = (1 + (gun + 27) % 7);
                    }
            }else {
                gun = (1 + (gun + 29) % 7);
            }
        }


    }
}
