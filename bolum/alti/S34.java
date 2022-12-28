package bolum.alti;

import java.util.Scanner;

public class S34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Beşgenin bir kenar uzunluğunu giriniz: ");
        double kenar = input.nextDouble();

        System.out.println("Beşgenin alanı : " + besgenAlaniGetir(kenar));
    }

    private static double besgenAlaniGetir(double kenar) {

        return (Math.sqrt(5 * (5 + 2) * Math.sqrt(5)) * kenar * kenar ) / 4;
    }
}
