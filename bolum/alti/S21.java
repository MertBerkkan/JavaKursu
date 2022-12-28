package bolum.alti;

import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tuşlu telefon sayılarına döndrmek istediğiniz metni giriniz.");
        String metin = input.nextLine();

        int uzunluk = metin.length();

        for (int i = 0; i <= uzunluk - 1; i++){
            char ch = metin.charAt(i);
            System.out.print(harfCevir(ch));
        }

    }

    private static char harfCevir(char i) {
        if (i == 'a' || i == 'b' || i == 'c'){
            return '2';
        } else if (i == 'd' || i == 'e' || i == 'f') {
            return '3';
        }else if (i == 'g' || i == 'h' || i == 'i') {
            return '4';
        } else if (i == 'j' || i == 'k' || i == 'l') {
            return '5';
        } else if (i == 'm' || i == 'n' || i == 'o') {
            return '6';
        } else if (i == 'p' || i == 'q' || i == 'r' || i == 's') {
            return '7';
        } else if (i == 't' || i == 'u' || i == 'v') {
            return '8';
        } else if (i == 'w' || i == 'x' || i == 'y' || i == 'z') {
            return '9';
        }
        return i;
    }
}
