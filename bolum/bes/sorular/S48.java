package bolum.bes.sorular;

import java.util.Scanner;

public class S48 {
    public static void main(String[] args) {
        String yazi, tekSayiHali = "";
        System.out.println("Bir yazı giriniz.");
        Scanner input = new Scanner(System.in);
        yazi = input.nextLine();

        int uzunluk = yazi.length();

        for (int i = 0; i <= uzunluk - 1; i++){

            if (i % 2 == 0){
                tekSayiHali = tekSayiHali + yazi.charAt(i);
            }
        }
        System.out.println(tekSayiHali);

    }
}
