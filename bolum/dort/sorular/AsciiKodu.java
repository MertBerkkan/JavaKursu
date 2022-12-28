package bolum.dort.sorular;

import java.util.Scanner;

public class AsciiKodu {

    public static void main(String[] args) {

        System.out.println("ASCII kodunu öğrenmek istediğiniz sayıyı girin.(0-127)");

        Scanner input = new Scanner(System.in);
        int asciiKod = input.nextInt();
        char karakter = (char) asciiKod;
        if (asciiKod >= 0 && asciiKod <= 127) {
            System.out.println(asciiKod + " ASCII kodun karakter: " + karakter);
        } else {
            System.err.println("Hatalı giriş yaptınız.");
        }
    }

}
