package bolum.uc.calisma;

import java.util.Scanner;

public class HangiAyKacGun {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ve yıl giriniz.");
        int gun = input.nextInt();
        int yil = input.nextInt();


        switch (gun) {
            case 1:
                System.out.println("Ocak " + yil + ": 31 gündür.");
                break;
            case 3:
                System.out.println("Mart " + yil + ": 31 gündür.");
                break;
            case 4:
                System.out.println("Nisan " + yil + ": 30 gündür.");
                break;
            case 5:
                System.out.println("Mayıs " + yil + ": 31 gündür.");
                break;
            case 6:
                System.out.println("Haziran " + yil + ": 30 gündür.");
                break;
            case 7:
                System.out.println("Temmuz " + yil + ": 31 gündür.");
                break;
            case 8:
                System.out.println("Ağustos " + yil + ": 31 gündür.");
                break;
            case 9:
                System.out.println("Eylül " + yil + ": 30 gündür.");
                break;
            case 10:
                System.out.println("Ekim " + yil + ": 31 gündür.");
                break;
            case 11:
                System.out.println("Kasım " + yil + ": 30 gündür.");
                break;
            case 12:
                System.out.println("Aralık " + yil + ": 31 gündür.");
                break;
            default:
                break;
        }

        if (gun == 2 && yil % 400 == 0) {
            System.out.println("Şubat " + yil + ": 29 gündür.");
        } else if (gun == 2 && yil % 400 != 0) {
            System.out.println("Şubat " + yil + ": 28 gündür.");
        }


    }

}
