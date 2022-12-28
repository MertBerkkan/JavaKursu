package bolum.alti;

import java.text.DecimalFormat;

public class S13 {
    public static void main(String[] args) {

        System.out.println("i\t\tm(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 20; i++){
            System.out.println(i + "\t\t" + new DecimalFormat("0.0000").format(miGetir(i)));
        }
    }

    private static double miGetir(int i) {
         double toplam = 0;

        for (double j = 1, k = 2; j <= i; j++, k++){
            toplam += j / k;

        }
        return toplam;
    }
}
