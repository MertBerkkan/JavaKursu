package bolum.uc.calisma;

import java.util.Scanner;

public class BooleanOperatorTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();

        if (sayi % 2 == 0 && sayi % 3 == 0) {
            System.out.println("Girdiğiniz sayı 2 ve 3 e tam bölünüyor");
        }
        if (sayi % 2 == 0 || sayi % 3 == 0) {
            System.out.println("Girdiğiniz sayı 2 veya 3 e bölünebiliyor.");
        }
        if (sayi % 2 == 0 ^ sayi % 3 == 0) {
            System.out.println("Girdiğiniz sayı 2 veya 3 e bölünebilir ama ikisine birden bölünemez. ");
        }
    }

}
