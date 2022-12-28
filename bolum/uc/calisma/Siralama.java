package bolum.uc.calisma;

import java.util.Scanner;

public class Siralama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 tam sayı giriniz.");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi2 > sayi3) {
            System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
        } else if (sayi2 > sayi1 && sayi1 > sayi3) {
            System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
        } else if (sayi1 > sayi3 && sayi3 > sayi2) {
            System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
        } else if (sayi2 > sayi3 && sayi3 > sayi1) {
            System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
        } else if (sayi3 > sayi1 && sayi1 > sayi2) {
            System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
        } else {
            System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
        }
    }

}
