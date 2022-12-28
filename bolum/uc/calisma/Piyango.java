package bolum.uc.calisma;

import java.util.Scanner;

public class Piyango {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 10 ile 99 arasında bir sayı giriniz.");

        int piyango = (int) (Math.random() * 90) + 10;
        int tahmin = input.nextInt();
        int piyangoBirler = piyango % 10;
        int piyangoOnlar = piyango / 10;
        int tahminBirler = tahmin % 10;
        int tahminOnlar = tahmin / 10;

        System.out.println("Piyango numarası : " + piyango);

        if (piyango == tahmin) {
            System.out.println("Tebrikler. 5 gece 16 gün Afganistan tatili kazandınız.");
        } else if (piyangoBirler == tahminOnlar && piyangoOnlar == tahminBirler) {
            System.out.println("Tebrikler 3 bin lira kazandınız.");
        } else if (piyangoBirler == tahminBirler || piyangoBirler == tahminOnlar || piyangoOnlar == tahminOnlar
                || piyangoOnlar == tahminBirler) {
            System.out.println("Tebrikler bin tl  kazandınız.");
        } else {
            System.out.println("Kaybettiniz.Üzgünüz HAHAHAHAHAHAHAHA");
        }

    }

}
