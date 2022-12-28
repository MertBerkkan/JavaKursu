package bolum.bes.sorular;

import java.util.Scanner;

public class S17Dongu {
    public static void main (String [] args){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Piramidin yüksekliğini giriniz.");
        int yukseklik = klavye.nextInt();
        for (int i = 1; i <= yukseklik; i++){
            for (int j = 1; j <= (yukseklik - i); j++){
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print("  " + k);
            }
            for (int l =2; l <= i; l++){
                System.out.print("  " + l);
            }
            System.out.println();
        }


    }
}

