package bolum.bes.sorular;

import java.util.Random;
import java.util.Scanner;

public class S34 {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        Random tkm = new Random();
        int dogru = 0;

        while (dogru <= 3){
            System.out.println("1) TAŞ / 2) KAĞIT / 3) MAKAS olacak şekilde sayı giriniz.");
            int tasKagitMakas = tkm.nextInt(4);
            int cevap = klavye.nextInt();
            String cevapyazi ;
            String tkmYazi ;

            if (cevap == 1 || cevap == 2 || cevap == 3) {

            switch (cevap){
                case 1 : cevapyazi = "Taş"; break;
                case 2 : cevapyazi = "Kağıt";break;
                default : cevapyazi = "Makas"; break;
            }
            switch (tasKagitMakas) {
                case 1: tkmYazi = "Taş"; break;
                case 2: tkmYazi = "Kağıt"; break;
                default: tkmYazi = "Makas"; break;
            }
            System.out.println("PC: " + tkmYazi);
            System.out.println("Siz: " + cevapyazi);

            if (cevap == tasKagitMakas){
                System.out.println("Bildiniz.");
                dogru++;
            }
            }else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
    }
}
