package bolum.alti;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz. ");
        String sayi = input.nextLine();
        String tersSayi = sayi;
        if (polindronMu(sayi,cevir(tersSayi))){
            System.out.println("Polindrom bir sayıdır." + sayi + " / " + cevir(tersSayi));
        }else {
            System.out.println("Polindrom bir sayı değildir." + sayi + " / " + cevir(tersSayi));

        }

    }


    public static String cevir(String i) {

        int uzunluk = i.length();
        String cevirilmisSayi = "";
        for (int k = uzunluk - 1; k >= 0; k--) {
            char ch1 = i.charAt(k);
           cevirilmisSayi += ch1;
        }
        return cevirilmisSayi;
    }

    private static boolean polindronMu(String i, String j) {
        if (i == j){
            return true;
        }else {
            return false;
        }
    }

}
