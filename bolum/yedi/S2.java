package bolum.yedi;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("10 tane sayı girniz.");
        int [] sayilar = new int[10];

        for (int i = 0; i < 10; i++){
            sayilar[i] = input.nextInt();
        }
        yazdirSayilar(sayilar);
        int [] tersSayilar = terseCevir(sayilar);
        tersSayilariYazdir(tersSayilar);

    }

    private static void tersSayilariYazdir(int[] tersSayilar) {
        for (int i = 0; i < tersSayilar.length; i++){
            System.out.print(tersSayilar[i] + "  ");
        }

    }

    private static void yazdirSayilar(int[] sayilar) {

        for (int i = 0; i < sayilar.length; i++){
            System.out.print(sayilar[i] + "  ");
        }
        System.out.println();
    }

    public static int[] terseCevir(int[] sayilar) {
        int[] tersSayilar = new int[10];
        for (int i = 0, j = 9; i < 10; i++,j--){
            tersSayilar[j] = sayilar[i];
        }
        return tersSayilar;
    }
}
