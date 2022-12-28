package bolum.bes;

import java.util.Scanner;

public class HexHesaplama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int tamsayi = klavye.nextInt();
        String hexSayi = "";
        int kalan = tamsayi;

        while (kalan > 0){
            int basamak = kalan % 16;
            if(basamak < 10){
                hexSayi = basamak + hexSayi;
            }else {
                hexSayi = (char)('A' + (basamak - 10)) + hexSayi;
            }
            kalan /= 16;
        }
        System.out.println(tamsayi + " sayısının hex değeri: " + hexSayi + " dır");
    }
}
