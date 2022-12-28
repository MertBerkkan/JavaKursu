package bolum.uc.calisma;

import java.util.Scanner;

public class VKI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ağırlığı kilo cinsinden giriniz.");

        double agirlik = input.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz");

        double boy = input.nextDouble();

        double vki = agirlik / (boy * boy);

        System.out.println("vki: " + vki);

        if (vki < 18.5) {
            System.out.println("Çok zayıf");
        } else if (vki < 25) {
            System.out.println("Normal");
        } else if (vki < 30) {
            System.out.println("Kilolu");
        } else if (vki < 35) {
            System.out.println("obez");
        }
    }

}
