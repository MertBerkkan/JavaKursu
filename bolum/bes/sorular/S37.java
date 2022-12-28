package bolum.bes.sorular;

import java.util.Scanner;

public class S37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();
        int s = 0, i = 0, basamak;

        while (sayi > 0){

            basamak = (int)((sayi % 2) * Math.pow(10,i));
            i++;
            sayi = sayi / 2;
            s = s + basamak;
        }
        System.out.println(sayi + " sayısının 2 lik tabandaki değeri " + s);
    }
}
