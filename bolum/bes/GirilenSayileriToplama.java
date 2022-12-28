package bolum.bes;

import java.util.Scanner;

public class GirilenSayileriToplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Toplanacak sayiyi giriniz.(çıkış için 0 giriniz.)");
		int sayi = input.nextInt();
		int toplam = 0;

		while (sayi != 0) {
			toplam += sayi;
			sayi = input.nextInt(); 
		}
		System.out.println("Toplam = " + toplam);
	}

}
