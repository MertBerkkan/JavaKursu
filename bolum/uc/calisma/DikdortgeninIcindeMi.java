package bolum.uc.calisma;

import java.util.Scanner;

public class DikdortgeninIcindeMi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("X1 ve Y1 değerleri giriniz.");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = 0;
        double y2 = 0;

        double araMesafe = Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 0.5);

        if ((araMesafe <= 10 / 2) && (araMesafe <= 5 / 2)) {
            System.out.println("( " + x1 + "," + y1 + ") dikdörtgenin içindedir.");
        } else {
            System.out.println("( " + x1 + "," + y1 + ") dikdörtgenin içinde değildir..");
        }
    }

}
