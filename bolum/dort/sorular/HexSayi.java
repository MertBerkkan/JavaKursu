package bolum.dort.sorular;

import java.util.Scanner;

public class HexSayi {

    public static void main(String[] args) {

        System.out.println("0 ile 15 arasında bir sayı girin.");
        Scanner input = new Scanner(System.in);

        int onluksayi = input.nextInt();
        String hex = Integer.toHexString(onluksayi);
        if (onluksayi <= 15 && onluksayi >= 0) {
            System.out.println("Hex versiyonu: " + hex);
        } else {
            System.err.println("Hatalı sayı girdiniz.");
        }
    }

}
