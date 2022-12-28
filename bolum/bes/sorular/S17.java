package bolum.bes.sorular;

import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int yukseklik = klavye.nextInt();
        int bosluk = 1;
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bosluk; k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            bosluk += 2;
        }
    }
}
