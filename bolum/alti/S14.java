package bolum.alti;

import java.text.DecimalFormat;

public class S14 {
    public static void main(String[] args) {

        System.out.println("i\t\tm(i)");
        System.out.println("----------------------");

        for (int i = 1; i <= 901; i += 100) {
            System.out.println(i + "\t\t" + new DecimalFormat("0.0000").format(pGetir(i)));
        }
    }

    private static double pGetir(int i) {
        int sayac = 1;
        double toplam = 0;
        for (double j = i; sayac <= 100000; j = j + 2, sayac++) {

            if (sayac % 2 == 1) {
                toplam += (double) 1 / j;
            } else {
                toplam -= (double) 1 / j;
            }
        }
        return toplam;
    }
}
