package bolum.uc.calisma;

import java.util.Random;
import java.util.Scanner;

public class YaziTura {

    public static void main(String[] args) {
        Random a = new Random();
        System.out.println("Yazı tura için bir değer giriniz. (Yazı : 0 Tura : 1");
        Scanner input = new Scanner(System.in);
        int tahmin = input.nextInt();

        int yaziTura = a.nextInt(2);

        if ((tahmin == 1 || tahmin == 0) && yaziTura == tahmin) {
            System.out.println("Tahmininiz: " + tahmin);
            System.out.println("Sonuç: " + yaziTura);
            System.out.println("Doğru tahmin ettiniz. Tebrikler.");
        } else if ((tahmin == 1 || tahmin == 0) && yaziTura != tahmin) {
            System.out.println("Tahmininiz: " + tahmin);
            System.out.println("Sonuç: " + yaziTura);
            System.out.println("Yanlış tahmin ettiniz. Üzgünüm.");

        } else {
            System.out.println("Hatalı sayı girdiniz.");
        }
    }

}
