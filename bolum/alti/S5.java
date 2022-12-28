package bolum.alti;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üç sayı giriniz.");
        int sayi3 = input.nextInt();
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        System.out.println("Büyükten küçüğe sıralnışı: ");

        sirala(sayi1, sayi2, sayi3);

    }
    public static void sirala(int i, int j, int l) {

        if (i > j && j > l) {
            System.out.println(i + " > " + j + " > " + l);
        } else if (j > i && i > l) {
            System.out.println(j + " > " + i + " > " + l);
        } else if (i > l && l > j) {
            System.out.println(i + " > " + l + " > " + j);
        } else if (j > l && l > i) {
            System.out.println(j + " > " + l + " > " + i);
        } else if (l > i && i > j) {
            System.out.println(l + " > " + i + " > " + j);
        } else if (l > j && j > i) {
            System.out.println(l + " > " + j + " > " + i);
        }
    }
}
