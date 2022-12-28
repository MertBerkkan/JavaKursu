package bolum.alti;

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harf sayısını öğrenmek istediğiniz metni giriniz.");
        String metin = input.nextLine();
        metin = metin.toLowerCase();

        System.out.println("Metindeki harf sayısı : " + metindekiHarfSayisi(metin));
    }

    private static int metindekiHarfSayisi(String metin) {
        int uzunluk = metin.length();
        int harfSayac = 0;

        for (int i = 0; i <= uzunluk - 1; i++){
            if ((int)metin.charAt(i) <= 122 && 97 <= (int)metin.charAt(i) || (int)metin.charAt(i) == 129 ||
                    (int)metin.charAt(i) == 135 || (int)metin.charAt(i) == 148 || (int)metin.charAt(i) == 159 || (int)metin.charAt(i) == 167){
                harfSayac++;
            }
        }
        return harfSayac;
    }
}
