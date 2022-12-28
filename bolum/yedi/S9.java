package bolum.yedi;

import java.util.Scanner;

public class S9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("En küçük sayiyi bulmak için 10 adet sayı giriniz.");

        double[] sayilar = new double[10];

        sayilariAta(input, sayilar);
        double min = enKucukSayiyiBul(sayilar);

        System.out.println("En küçük sayı : " + min);
    }

    public static double enKucukSayiyiBul(double[] sayilar) {
        double min = 1000000000;

        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] < min){
                min = sayilar[i];
            }
        }
        return min;
    }

    public static void sayilariAta(Scanner input, double[] sayilar) {
        for (int i = 0; i < sayilar.length; i++){
            sayilar[i] = input.nextDouble();
        }
    }
}
