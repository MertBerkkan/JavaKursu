package bolum.bes.sorular;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S31 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Anapara miktarını giriniz : ");
        int anapara = klavye.nextInt();
        System.out.print("Yıllık faiz oranını giriniz : ");
        double yillikFaiz = klavye.nextDouble();
        System.out.print("Ay sayısını giriniz : ");
        int ay = klavye.nextInt();

        double aylikFaiz = yillikFaiz / 1200;
        double birikenMiktar = anapara;
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Ay\tBiriken Tutar");

        for (int i = 1; i <= ay; i++){

            birikenMiktar = birikenMiktar + anapara * aylikFaiz;

            System.out.println(i + "\t  " + df.format(birikenMiktar));
        }
    }
}
