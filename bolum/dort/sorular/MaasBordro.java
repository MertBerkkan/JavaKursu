package bolum.dort.sorular;

import java.util.Scanner;

public class MaasBordro {

    public static void main(String[] args) {

        System.out.println("Çalışan adı:");
        Scanner input = new Scanner(System.in);
        String isim = input.next();

        System.out.println("Haftalık çalışma saati:");
        int haftalikSaat = input.nextInt();

        System.out.println("Saatlik ücret:");
        double saatlikUcret = input.nextDouble();

        System.out.println("Gelir vergisi:");
        double gelirVergisi = input.nextDouble();

        System.out.println("Damga vergisi:");
        double damgaVergisi = input.nextDouble();

        double brutUcret = saatlikUcret * haftalikSaat;
        double gelirVergisiUcreti = brutUcret * gelirVergisi;
        double damgaVergisiUcreti = brutUcret * damgaVergisi;

        System.out.println("Çalışan adı: " + isim);
        System.out.println("Haftalık çalışma saati: " + haftalikSaat);
        System.out.println("Saatlik ücret: " + saatlikUcret + " tl");
        System.out.println("Brüt ödeme: " + brutUcret + " tl");
        System.out.println("Maaş bordrosu:");
        System.out.println("     Gelir vergisi ücreti (" + (gelirVergisi * 100) + "%) : " + gelirVergisiUcreti + " tl");
        System.out.println("     Damga vergisi ücreti (" + (damgaVergisi * 100) + "%) : " + (int) (damgaVergisiUcreti * 100) / 100.0 + " tl");
        System.out.println("     Toplam ödeme : " + (gelirVergisiUcreti + damgaVergisiUcreti) + " tl");
        System.out.println("Net ödeme : " + (brutUcret - (gelirVergisiUcreti + (int) (damgaVergisiUcreti * 100) / 100.0)) + " tl");
    }

}
