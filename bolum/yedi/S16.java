package bolum.yedi;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tBİREBİR EŞ DİZİLER\n Biribiriyle birebir eş mi diye kontrol etmek istediğiniz dizileri giriniz.(5 sayı)\n Dizi 1: ");

        int[] dizi1 = new int[5];

        int[] dizi2 = new int[5];

        diziAta(input, dizi1);

        System.out.println("Dizi 2:" );

        diziAta(input, dizi2);

        if (birebirMi(dizi1, dizi2)){
            System.out.println("Dizileriniz birebir aynıdır.");
        }else {
            System.out.println("Dizileriniz aynı değil.");
        }
    }

    private static boolean birebirMi(int[] dizi1, int[] dizi2) {
        for (int i = 0; i < dizi2.length; i++){
            if (dizi1[i] != dizi2[i]) {
                return false;
            }
        }
        return true;
    }

    private static void diziAta(Scanner input, int[] dizi) {
        for (int i = 0; i < dizi.length; i++){
            dizi[i] = input.nextInt();
        }
    }


}
