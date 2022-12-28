package bolum.uc.calisma;

import java.util.Scanner;

public class HaftaSonuMu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün giriniz. ( Pazartesi = 1 ,Pazar = 7");

        int gun = input.nextInt();

        switch (gun) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi.");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");

                break;
            default:
                System.out.println("Yanlış girdi.");
        }

        System.out.println("Devam etmek ister misiniz.?");

        String cevap = input.next();

        switch (cevap.charAt(0)) {
            case 'e':
            case 'E':
                System.out.println("İyi devam et o zaman");
                break;
            case 'h':
            case 'H':
                System.out.println("Peki");
                break;
            default:
                System.out.println("Ne diyorsun anlamıyorum.");
        }

    }

}
