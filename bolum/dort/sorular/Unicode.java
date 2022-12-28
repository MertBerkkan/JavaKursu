package bolum.dort.sorular;

import java.util.Scanner;

public class Unicode {

    public static void main(String[] args) {

        System.out.println("Unicod halini istediğiniz karakteri giriniz.");

        Scanner input = new Scanner(System.in);
        String karakter = input.next();
        char karakterCh = karakter.charAt(0);
        int ascii = (int) karakterCh;

        System.out.println(karakter + " karakterinin Unıcode u : " + ascii);
    }

}
