package bolum.bes.sorular;

import java.util.Scanner;

public class s46 {
    public static void main(String[] args) {

        String orjinal, ters = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Ters çevirilecek yazıyı giriniz.");

        orjinal = input.nextLine();
        int uzunluk = orjinal.length();

        for (int i = uzunluk - 1; i >= 0; i--){
            ters = ters + orjinal.charAt(i);
        }
        System.out.println("Yazınızın ters hali : " + ters);
    }
}
