package bolum.alti;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        long sayi = input.nextInt();
        cevir(sayi);

    }
    public static void cevir (long i){

        System.out.print("Sayının ters çevirilmiş hali : ");
        while (i > 0){

            System.out.print(i % 10);

            i /= 10;
        }
    }
}
