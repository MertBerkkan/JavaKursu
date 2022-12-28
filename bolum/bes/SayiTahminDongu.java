package bolum.bes;

import java.util.Scanner;

public class SayiTahminDongu {

	public static void main(String[] args) {

		int sayi = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		System.out.println("0 ile 100 arasında bir sayı tahmin ediniz.");
		int tahmin = input.nextInt();

		while (sayi != tahmin) {
			if (sayi < tahmin) {
				System.out.println("Büyük bir sayı girdiniz.");
			} else {
		 		System.out.println("Küçük bir sayı girdiniz.");
			}
			System.out.println("0 ile 100 arasında bir sayı tahmin ediniz.");
			tahmin = input.nextInt();
		}
		System.out.println("Bildiniz.");
	}

}
