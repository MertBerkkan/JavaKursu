package bolum.yedi;

import java.util.Arrays;
import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sıralı olup olmadığını kontrol etmek istediğiniz 10 adet sayıyı giriniz.");
        int [] sayilar = new int[10];

        sayilariAta(input, sayilar);
        int [] kopya = kopyalasayilar(sayilar);
        sirala(kopya);
        sayilarYazdir(sayilar, kopya);
    }

    private static int[] kopyalasayilar(int[] sayilar) {
        int kopya[] = new int[10];
        for (int i = 0; i < sayilar.length; i++){
            kopya[i] = sayilar[i];
        }
        return kopya;
    }

    private static void sayilarYazdir(int[] sayilar, int[] sirali) {
       if ( siraliMi(sirali, sayilar)){
           System.out.println("Sayılar küçükten büyüğe doğru sıralıdır.");
       }else {
           System.out.println("Sayılar sıralı değildir.");
       }
    }

    private static boolean siraliMi(int[] sirali, int[] sayilar) {
        if (Arrays.equals(sirali, sayilar)){
            return true;
        }
        return false;
    }

    private static int []  sirala(int[] sayilar) {
        Arrays.sort(sayilar);

        return sayilar;
    }

    private static void sayilariAta(Scanner input, int[] sayilar) {

        for (int i = 0; i < sayilar.length; i++){
            sayilar[i]= input.nextInt();
        }
    }
}
