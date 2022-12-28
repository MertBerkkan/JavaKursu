package bolum.uc.calisma;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        System.out.println("3 basamaklı bir sayı giriniz.");

        Scanner input = new Scanner(System.in);
        int palindrom = input.nextInt();
        if (palindrom % 10 == palindrom / 100) {
            System.out.println(palindrom + " palindrom bir sayıdır.");
        } else {
            System.out.println(palindrom + " palindrom bir sayı değildir.");

        }


    }

}
