package bolum.bes.sorular;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S22 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kredi miktarını giriniz:");
        double krediTutari = klavye.nextDouble();
        System.out.print("Ödeme yılını giriniz:");
        double yil = klavye.nextDouble();
        System.out.print("Yıllık faiz oranını giriniz:");
        double yillikFaizOrani = klavye.nextDouble();
        double aylikFaizOrani = yillikFaizOrani / 1200;
        double taksitSayisi = yil * 12;
        double aylikOdeme = krediTutari * aylikFaizOrani / (1 - 1 / Math.pow(1 + aylikFaizOrani, taksitSayisi));
        double toplamOdeme = aylikOdeme * taksitSayisi;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Aylık ödeme : " + df.format(aylikOdeme));
        System.out.println("Toplam ödeme : " + df.format(toplamOdeme));
        System.out.println();
        System.out.println("Taksit\tFaiz\t\tAnapara\t\tKalan Kredi Tutarı");

        for (int i = 1; i <= taksitSayisi; i++){
            double faiz = aylikFaizOrani * krediTutari;
            double anapara = aylikOdeme - faiz;
            krediTutari = krediTutari - anapara;

            System.out.println(i + "\t\t" + df.format(faiz) + "\t\t" + df.format(anapara) + "\t\t" + df.format(krediTutari));
        }
    }
}
