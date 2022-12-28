package bolum.yedi;

import java.util.Scanner;

public class DiziTersYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir yazı giriniz.");

        String yazi = input.nextLine();

        char[] yaziDizisi = yazi.toCharArray();

        char[] yazininTersi = terseCevir(yaziDizisi);

        System.out.print("Girdiğiniz yazının tersi : ");
        System.out.println(yazininTersi);
    }
    private static char[] terseCevir(char[] yaziDizisi) {
        char[] tersi = new char[yaziDizisi.length];

        for (int i = 0, j = yaziDizisi.length - 1; i < yaziDizisi.length; i++, j--) {

            tersi[j] = yaziDizisi[i];
        }
        return tersi;
    }
}
