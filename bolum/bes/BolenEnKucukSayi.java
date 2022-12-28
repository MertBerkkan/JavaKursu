package bolum.bes;

import java.util.Scanner;

public class BolenEnKucukSayi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = klavye.nextInt();
        int bolen = 2;
        while(bolen <= sayi){
            if(sayi % bolen == 0){
                break;
            }
            bolen++;
        }
        System.out.println(sayi + " sayısının en küçük böleni: " + bolen);
    }
}
