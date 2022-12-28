package bolum.alti;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz ve o metindeki tekrar sayısını bulmak istediğiniz harfi giriniz.");
        System.out.println("Metin: ");
        String metin = input.nextLine().toLowerCase();
        
        
        System.out.print("Harf: ");
       String harf = input.nextLine().toLowerCase();
       char harfChar = harf.charAt(0);
        
       int harfAdeti= kacTaneVar(metin, harfChar);
        System.out.println(metin);
        System.out.println("\nMetninde " + harfAdeti + " tane " + harfChar + " harfi vardır.");
    }

    private static int kacTaneVar(String metin, char harf) {
        int uzunluk = metin.length();
        int sayac = 0;

        for (int i = 0; i <= uzunluk - 1; i++){
            if (metin.charAt(i) == harf){
                sayac++;
            }
        }
        return sayac;
    }
}
