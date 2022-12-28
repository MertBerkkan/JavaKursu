package bolum.bes;

import java.util.Scanner;

public class DonguToplama {

	public static void main(String[] args) {

		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);
		System.out.println(sayi1 + " + " + sayi2 + " = ?");

		int cevap = input.nextInt();

		while (sayi1 + sayi2 != cevap) {
			System.out.println("Yanlış cevap girdiniz.");
			System.out.println(sayi1 + " + " + sayi2 + " = ?");
			cevap = input.nextInt();
		}
		System.out.println("Bildiniz...");
	}

}
