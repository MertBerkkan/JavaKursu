package bolum.bes;

import java.util.Scanner;

public class Obeb {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz.");
        int sayi1 = klavye.nextInt();
        System.out.println("2.sayıyı giriniz.");
        int sayi2 = klavye.nextInt();
        int obeb = 1;
        int bolen = 2;
        while (bolen <= sayi1 && bolen <= sayi2){
            if(sayi1 % bolen == 0 && sayi2 % bolen == 0){
                obeb = bolen;
            }
            bolen++;
        }
        System.out.println(sayi1 + " ile " + sayi2 + "'nın obebi : " + obeb + "'dır");
    }
}
