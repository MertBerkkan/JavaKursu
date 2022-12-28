package bolum.dort.sorular;

import java.util.Scanner;

public class CokgenAlan {

    public static void main(String[] args) {

        System.out.println("Kenar sayısı giriniz.");
        Scanner input = new Scanner(System.in);
        double kenarSayi = input.nextDouble();
        System.out.println("Bir kenar uzunluğunu girin.");
        double kenarUzunluk = input.nextDouble();

        double alan = (kenarSayi * kenarUzunluk * kenarUzunluk) / (4 * Math.tan(3.14159265359 / kenarSayi));

        System.out.println("Çokgenin alanı: " + alan);
    }

}
