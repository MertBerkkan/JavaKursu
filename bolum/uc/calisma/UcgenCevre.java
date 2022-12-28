package bolum.uc.calisma;

import java.util.Scanner;

public class UcgenCevre {

    public static void main(String[] args) {

        System.out.println("Üçgeniz kenar uzunluklarını giriniz.");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a + b < c) {
            System.out.println("Geçersiz uzunluk değeri");
        } else if (a + c < b) {
            System.out.println("Geçersiz uzunluk değeri");
        } else if (b + c < a) {
            System.out.println("Geçersiz uzunluk değeri");
        } else {
            System.out.println("Üçgeniz çevresi: " + (a + b + c));
        }


    }

}
