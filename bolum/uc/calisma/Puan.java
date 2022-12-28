package bolum.uc.calisma;

import java.util.Scanner;

public class Puan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dersten aldığınız puanı giriniz(0 ile 100 arasında):");

        int dersPuan = input.nextInt();

        if (dersPuan >= 90) {
            System.out.println("Ders notunuz A");
        } else if (dersPuan >= 80) {
            System.out.println("Ders notunuz B");
        } else if (dersPuan >= 70) {
            System.out.println("Ders notunuz C");
        } else if (dersPuan >= 60) {
            System.out.println("Ders notunuz D");
        } else {
            System.out.println("Ders notunuz F");
        }

    }

}
