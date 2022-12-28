package bolum.dort.sorular;

import java.util.Scanner;

public class IkiNoktaArasi {

    public static void main(String[] args) {

        System.out.println("Enlem ve boylam giriniz.(1)");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enlem ve boylam giriniz.(2)");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1Radyan = Math.toRadians(x1);
        double y1Radyan = Math.toRadians(y1);
        double x2Radyan = Math.toRadians(x2);
        double y2Radyan = Math.toRadians(y2);

        double araMesafe = Math.acos(Math.sin(x1Radyan) * Math.sin(x2Radyan) + Math.cos(x1Radyan) * Math.cos(x2Radyan) * Math.cos(y1Radyan - y2Radyan));

        System.out.println("İki nokta arasındaki uzaklık: " + araMesafe + " km");
    }

}
