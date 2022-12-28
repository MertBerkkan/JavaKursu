package bolum.alti;

import java.text.DecimalFormat;

public class S8 {
    public static void main(String[] args) {

        System.out.println("Santigrat\tFahrenayt\t|\tFahrenayt\tSantigrat");
        System.out.println("-------------------------------------------------------------");

        for (double santigrat = 40.0, fahrenayt = 120.0; santigrat >= 31.0; santigrat--, fahrenayt += 10){

            System.out.print(santigrat + "\t\t" + new DecimalFormat("0.00").format(fahrenaytaCevir(santigrat)));
            System.out.print("\t\t|\t" + fahrenayt + "\t\t" + new DecimalFormat("0.##").format(santigrataCevir(fahrenayt)));
            System.out.println();
        }
    }

    private static double santigrataCevir(double fahrenayt) {
        return (5.0 / 9) * (fahrenayt - 32);
    }

    private static double fahrenaytaCevir(double santigrat) {
        return (9.0 / 5) * santigrat +32;
    }
}
