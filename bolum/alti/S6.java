package bolum.alti;

import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgen için bir sayı giriniz.");
        int sayi = input.nextInt();
        ucgenDesen(sayi);
    }

    private static void ucgenDesen(int sayi) {
        int bosluk = 1;
        for (int i = 1; i <= sayi; i++){
            for (int j = sayi; j >= 1; j--){
                if (j > bosluk){
                    System.out.print("  ");
                }else {
                    System.out.printf("%4d  ", j);
                }
            }
            System.out.println();
            bosluk ++;
        }
    }
}
