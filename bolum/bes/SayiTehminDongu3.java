package bolum.bes;

import java.util.Scanner;

public class SayiTehminDongu3 {

	public static void main(String[] args) {

		int sayi = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		int tahmin = -1;

		while (sayi != tahmin) {
			System.out.println("0 ile 100 arasında bir sayı tahmin ediniz.");
			tahmin = input.nextInt();

			if (sayi == tahmin) {
				System.out.println("Bildiniz.");
			} else if (sayi < tahmin) {

				System.out.println("Büyük bir sayı girdiniz.");
			} else {
				System.out.println("Küçük bir sayı girdiniz.");
			}
		}
	}
}
