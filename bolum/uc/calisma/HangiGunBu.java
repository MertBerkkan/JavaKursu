package bolum.uc.calisma;

import java.util.Scanner;

public class HangiGunBu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl giriniz: (2012- .....)");
        int yil = input.nextInt();
        System.out.println("Ay giriniz: (1-12)");
        int ay = input.nextInt();
        System.out.println("Gün giriniz: (1-31)");
        int gun = input.nextInt();


        if (ay == 1) {
            ay = 13;
            yil = yil - 1;
        }
        if (ay == 2) {
            ay = 14;
            yil = yil - 1;
        }

        int t = (gun + ((26 * (ay + 1)) / 10)) + (yil % 100) + ((yil % 100) / 4) + ((yil / 100) / 4)
                + (5 * (yil / 100));
        int h = t % 7;

        if (h == 0) {
            System.out.println("Günlerden CUMARTESİ");
        } else if (h == 1) {
            System.out.println("Günlerden PAZAR");
        } else if (h == 2) {
            System.out.println("Günlerden PAZARTESİ");
        } else if (h == 3) {
            System.out.println("Günlerden SALI");
        } else if (h == 4) {
            System.out.println("Günlerden ÇARŞAMBA");
        } else if (h == 5) {
            System.out.println("Günlerden PERŞEMBE");
        } else if (h == 6) {
            System.out.println("Günlerden CUMA");
        } else {
            System.out.println(h);
        }

    }
}
