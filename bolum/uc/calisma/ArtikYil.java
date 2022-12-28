package bolum.uc.calisma;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir yıl giriniz.");

        int yil = input.nextInt();

        boolean artikYilMi = yil % 4 == 0;

        artikYilMi = artikYilMi && yil % 100 != 0;
        artikYilMi = artikYilMi || yil % 400 == 0;

        if (artikYilMi) {
            System.out.println(yil + " :artık yıldır");
        } else {
            System.out.println(yil + " :artık yıl değildir");

        }


    }

}
