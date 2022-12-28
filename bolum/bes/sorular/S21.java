package bolum.bes.sorular;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kredi miktarını giriniz.");
        int krediTutari = klavye.nextInt();
        System.out.println("Yıl sayısını giriniz");
        int yil = klavye.nextInt();
        int taksitSayisi = yil * 12;
        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println("Faiz Oranı\tAylık Ödeme\tToplam Ödeme");
        for (double faiz = 5.0; faiz <= 8.0; faiz += 0.125){
            double aylikFaiz = faiz / 1200;
            double aylikOdeme = krediTutari * aylikFaiz / (1 - 1 / Math.pow(1 + aylikFaiz, taksitSayisi));
            double toplamOdeme = aylikOdeme * taksitSayisi;
            System.out.println(df.format(faiz) + "\t\t" + df.format(aylikOdeme) + "\t\t" + df.format(toplamOdeme));
        }
    }
}
