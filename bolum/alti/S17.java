package bolum.alti;

import java.util.Random;
import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris için bir 'n' değeri giriniz:");

        int n = input.nextInt();
        matrixYazdir(n);
    }

    private static void matrixYazdir(int n) {
        Random rd = new Random();
        for (int i = 1; i <= n; i++){
            int r = rd.nextInt(2);
            System.out.print(r);
            for (int j = 1; j <= n -1; j++){
                int rdm = rd.nextInt(2);
                System.out.print(rdm);
            }
            System.out.println();
        }

    }
}
