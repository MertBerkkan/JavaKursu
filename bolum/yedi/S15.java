package bolum.yedi;

import java.util.Random;
import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Kutu sayısını giriniz:");

        int kutu = input.nextInt();

        System.out.println("Top sayısını giriniz:");

        int top = input.nextInt();

        int bosluk = 1;

        for (int i = 1; i <= kutu; i++) {
            for (int k = 1; k <= kutu - i; k++){
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--){
                int random = rd.nextInt(2);
                System.out.print("  " + (random == 0 ? ">" : "<"));
            }
            for (int l =2; l <= i; l++){
                int random = rd.nextInt(2);
                System.out.print("  " + (random == 0 ? ">" : "<"));
            }
            System.out.println();
        }
        }
    }
