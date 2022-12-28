package bolum.bes.sorular;

import java.util.Scanner;

public class S49 {
    public static void main(String[] args) {
        String yazi, bosluksuz = "";
        System.out.println("Bir yazı giriniz.");
        Scanner input = new Scanner(System.in);

        yazi = input.nextLine();
        bosluksuz = yazi.replace(" ", "");
        bosluksuz = bosluksuz.toUpperCase();
        int uzunluk = bosluksuz.length();
        int unluSayac = 0;

        for (int i = 0; i < uzunluk; i++) {
            if (bosluksuz.charAt(i) == 'A' || bosluksuz.charAt(i) == 'E' || bosluksuz.charAt(i) == 'I' || bosluksuz.charAt(i) == 'İ' || bosluksuz.charAt(i) == 'O' || bosluksuz.charAt(i) == 'Ö' || bosluksuz.charAt(i) == 'Ü' || bosluksuz.charAt(i) == 'U') {
                unluSayac++;
            }
        }
        System.out.println("Ünlü harf sayısı : " + unluSayac);
        System.out.println("Ünsüz harf sayısı : " + (uzunluk - unluSayac));
    }
}
