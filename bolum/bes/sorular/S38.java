package bolum.bes.sorular;

import java.util.Scanner;

public class S38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayiGirdi = input.nextInt();
        int sayi = sayiGirdi;
        int s = 0, i = 0, basamak ;

        while (sayi > 0){

            basamak = (int)((sayi % 8) * Math.pow(10,i));
            i++;
            sayi = sayi / 8;
            s = s + basamak;
        }
        System.out.println(sayiGirdi + " sayısının değeri " + s);
    }
}
