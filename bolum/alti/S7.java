package bolum.alti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz:");
        int yil = input.nextInt();
        System.out.print("Tutar giriniz: ");
        double para = input.nextDouble();
        System.out.print("Yıllık faiz giriniz: ");
        double yillikFaiz = input.nextDouble();
        double aylikFaiz = yillikFaiz / 1200;


        System.out.println("Yıl\tAnlık Tutar");

        for (int i = 1; i <= yil; i++){
            System.out.println( i + "\t" + new DecimalFormat("##.##").format(faizHesabiGetir(para, aylikFaiz, i)));
        }
    }

    private static double faizHesabiGetir(double para, double aylikFaiz, int i) {

        return para * Math.pow((1 + aylikFaiz), (double) i * 12);
    }
}
