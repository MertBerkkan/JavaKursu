package bolum.uc.calisma;

import java.util.Scanner;

public class CebirDenklem {

    public static void main(String[] args) {

        System.out.println("2 * 2 Cebir doğrusal denklemi için a, b, c, d, f, e değerleri giriniz.");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));


        if ((a * d) - (b * c) == 0) {
            System.out.println("Denklemin çözümü yoktur.");
        }
    }

}
