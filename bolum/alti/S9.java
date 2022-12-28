package bolum.alti;

import java.text.DecimalFormat;

public class S9 {
    public static void main(String[] args) {
        System.out.println("Feet\tMetre\t|\tMetre\tFeet");
        System.out.println("-------------------------------------------------------------");

        for (double feet = 1.0, metre = 20.0; feet <= 126.0; feet++, metre += 5) {

            if (feet >= 10.0) {
                System.out.print(feet + "\t" + new DecimalFormat("0.00").format(metreyeCevir(feet)));
                System.out.print("\t|\t" + metre + "\t\t" + new DecimalFormat("0.##").format(feeteCevir(metre)));
                System.out.println();

            } else {
            System.out.print(feet + "\t\t" + new DecimalFormat("0.00").format(metreyeCevir(feet)));
            System.out.print("\t|\t" + metre + "\t\t" + new DecimalFormat("0.##").format(feeteCevir(metre)));
            System.out.println();
        }
        }
    }

    private static double metreyeCevir(double feet) {
        return 0.305 * feet;
    }

    private static double feeteCevir(double metre) {
        return 3.279 * metre;
    }
    }

