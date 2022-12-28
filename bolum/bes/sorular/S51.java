package bolum.bes.sorular;

import java.util.Scanner;

public class S51 {
    public static void main(String[] args) {
        String yazi, yaziIki, cikti = "";
        System.out.println("Bir yazı giriniz.");
        Scanner input = new Scanner(System.in);

        yazi = input.nextLine();
        yaziIki = input.nextLine();

        long uzunluk = yazi.length();
        long uzunlukIki = yaziIki.length();
        long sayac = 0;

        for (int i = 0; i < (uzunluk > uzunlukIki ? uzunluk - 1 : uzunlukIki - 1); i++){
            if (yazi.charAt(i) == yaziIki.charAt(i)){
                cikti = cikti + yazi.charAt(i);
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println(yazi + " ve " + yaziIki + " arasında ortak nokta yoktur.");
        }else {
            System.out.println("Ortak nokta : " + cikti);
        }
    }
}
