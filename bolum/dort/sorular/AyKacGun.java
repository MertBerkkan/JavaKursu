package bolum.dort.sorular;

import java.util.Scanner;

public class AyKacGun {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz.");

        int yil = input.nextInt();

        System.out.println("Ay giriniz (Yazıyla)");

        String ay = input.next().toLowerCase();

        String ocak = "ocak";
        String subat = "şubat";
        String mart = "mart";
        String nisan = "nisan";
        String mayis = "mayis";
        String haziran = "haziran";
        String temmuz = "temmuz";
        String agustos = "ağustos";
        String eylul = "eylül";
        String ekim = "ekim";
        String kasim = "kasim";
        String aralik = "aralik";


        if (ay.equalsIgnoreCase(ocak)) {
            System.out.println("Ocak " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(mart)) {
            System.out.println("Mart " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(nisan)) {
            System.out.println("Nisan " + yil + ": 30 gündür.");
        } else if (ay.equalsIgnoreCase(mayis)) {
            System.out.println("Mayıs " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(haziran)) {
            System.out.println("Haziran " + yil + ": 30 gündür.");
        } else if (ay.equalsIgnoreCase(temmuz)) {
            System.out.println("Temmuz " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(agustos)) {
            System.out.println("Ağustos " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(eylul)) {
            System.out.println("Eylül " + yil + ": 30 gündür.");
        } else if (ay.equalsIgnoreCase(ekim)) {
            System.out.println("Ekim " + yil + ": 31 gündür.");
        } else if (ay.equalsIgnoreCase(kasim)) {
            System.out.println("Kasım " + yil + ": 30 gündür.");
        } else if (ay.equalsIgnoreCase(aralik)) {
            System.out.println("Aralık " + yil + ": 31 gündür.");
        } else if ((yil / 400 == 0) && (ay.equalsIgnoreCase(subat))) {
            System.out.println("Şubat " + yil + ": 29 gündür.");
        } else if ((yil / 400 != 0) && (ay.equalsIgnoreCase(subat))) {
            System.out.println("Şubat " + yil + ": 28 gündür.");


        }
    }
}

