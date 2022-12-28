package bolum.bes.sorular;

import java.util.Scanner;

public class S50 {
    public static void main(String[] args) {
        String yazi, bosluksuz = "";
        System.out.println("Bir yazı giriniz.");
        Scanner input = new Scanner(System.in);

        yazi = input.nextLine();
        bosluksuz = yazi.replace(" ", "");
        int uzunluk = bosluksuz.length();
        int kucukHarfSayac = 0;

        for (int i = 0; i < uzunluk; i++){
            if (Character.isLowerCase(bosluksuz.charAt(i))){
                kucukHarfSayac++;
            }
        }
        System.out.println("Metindeki büyük harf sayısı : " + (uzunluk - kucukHarfSayac));
        System.out.println("Metindeki küçük harf sayısı : " + kucukHarfSayac);
    }
}
