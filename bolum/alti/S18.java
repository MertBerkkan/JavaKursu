package bolum.alti;

import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir şifre beliryeniz.");
        System.out.println("\t Şifre en az 8 karakterden oluşmalıdır.");
        System.out.println("\t Şifre sadece harf ve rakamlardan oluşabilir.");
        System.out.println("\t Şifre en az iki rakam içermelidir.");
        System.out.println("Şifreniz: ");

        String sifre = input.nextLine();
        int uzunluk = sifre.length();

        if (uzunluk >= 8) {
            if (rakamKacTane(sifre)) {
                if (sadeceHarfRakamMi(sifre)){
                    System.out.println("Geçerli Şifre.");
                }else {
                    System.out.println("Geçersiz şifre.");
                }
            }else {
                System.out.println("Geçersiz şifre.");
            }
        }else {
            System.out.println("Geçersiz şifre.");
        }


    }

    private static boolean sadeceHarfRakamMi(String sifre) {
        int uzunluk = sifre.length();
        sifre = sifre.toUpperCase();
        for (int i = 0; i <= uzunluk - 1; i++) {
            if ((int) sifre.charAt(i) <= 57 && (int) sifre.charAt(i) >= 48 || sifre.charAt(i) <= 90 && (int) sifre.charAt(i) >= 65){
                return true;
            }
        }
        return false;
    }

    private static boolean rakamKacTane(String sifre) {
        int uzunluk = sifre.length();
        int sayacRakam = 0;
        for (int i = 0; i <= uzunluk - 1; i++) {
            if ((int) sifre.charAt(i) <= 57 && (int) sifre.charAt(i) >= 48 ) {
                sayacRakam++;
            }
            if (sayacRakam >= 2) {
                return true;
            }
        }
        return false;
    }
}

