package bolum.bes;

import java.util.Scanner;

public class CokluCikartmaDongu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long girisZamani = System.currentTimeMillis();
		String rapor = "";
		int sayac = 0;
		int dogruSayaci = 0;
		while (sayac < 5) {
			int sayi1 = (int) (Math.random() * 10);
			int sayi2 = (int) (Math.random() * 10);

			if (sayi1 < sayi2) {
				int geciciSayi = sayi1;
				sayi1 = sayi2;
				sayi2 = geciciSayi;
			}
			System.out.println(sayi1 + " - " + sayi2 + " = ?");

			int cevap = input.nextInt();

			if (sayi1 - sayi2 == cevap) {
				System.out.println("Bildiniz.");
				dogruSayaci++;
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " doğru\n";
			} else {
				System.out.println("Yanlış cevap.");
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " yanlış\n";
			}
			sayac++;
		}
		long bitisZamani = System.currentTimeMillis();
		long sure = (bitisZamani - girisZamani) / 1000;
		System.out.println(sure + " saniyede tamamlanmıştır.");
		System.out.println(sayac + " tane soru cevapladınız.");
		System.out.println(dogruSayaci + " tane doğru cevapladınız.");
		System.out.println(rapor);
	}

}
