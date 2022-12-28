package bolum.yedi;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] tipDizisi = { "Karo", "Maca", "Sinek", "Kupa" };
        String[] sayiDizisi = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz", "Papaz" };

        int[] iskambilDestesi = new int[52];
        int[] sayiDegerleri = new int[13];

        for (int i = 0; i < iskambilDestesi.length; i++) {
            iskambilDestesi[i] = i;
        }

        for (int i = 0; i < iskambilDestesi.length; i++) {
            int rassalIndex = (int)(Math.random() * 52);

            int gecici = iskambilDestesi[i];
            iskambilDestesi[i] = iskambilDestesi[rassalIndex];
            iskambilDestesi[rassalIndex] = gecici;
        }

        for (int i = 0; i < sayiDegerleri.length; i++){
            sayiDegerleri[i] = i +1;
        }

        System.out.println("\t\tKartların toplamı 21 olursa kazanırsnınız.\n Kart çekmek için elinizdeki toplam sayısını giriniz:(Başlangıcta 0)");

        int i = 0;
        while (i <= iskambilDestesi.length){

            System.out.println("Toplam sayıyı gir ve kart çek: ");

            int eldekiToplam = input.nextInt();

            String tip = tipDizisi[iskambilDestesi[i] / 13];
            String sayi = sayiDizisi[iskambilDestesi[i] % 13];

            int toplam = sayiDegerleri[(iskambilDestesi[i] % 13)];

            System.out.print(tip + " " + sayi + " toplam : ");

            toplam += eldekiToplam;

            System.out.println(toplam);

            i++;

            if (toplam == 21){
                System.out.println("KAZANDINIZ.");
                break;
            } else if (toplam > 21 ) {
                System.out.println("KAYBETTİNİZ.");
                break;
            }
        }
    }
}
