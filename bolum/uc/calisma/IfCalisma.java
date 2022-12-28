package bolum.uc.calisma;

import java.util.Scanner;

public class IfCalisma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();

        if (sayi % 5 == 0) {
            System.out.println("5 e bölünebilir");
        }
        if (sayi % 2 == 0) {
            System.out.println("Sayı 2 ye bölünebilir.");
        }
    }
} 