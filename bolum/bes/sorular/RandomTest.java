package bolum.bes.sorular;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sayac = 0;
		int dogruSayisi = 0;
		long baslangicZamani = System.currentTimeMillis();

		while (sayac < 10) {
			int sayi1 = (int) (Math.random() * 15) + 1;
			int sayi2 = (int) (Math.random() * 15) + 1;

			System.out.println(sayi1 + " + " + sayi2 + " = ? ");
			int cevap = input.nextInt();

			if (sayi1 + sayi2 == cevap) {
				System.out.println("Doğru cevap");
				dogruSayisi++;
			} else {
				System.out.println("Yanlış cevap");
			}

			sayac++;
		}
		long bitisZamani = System.currentTimeMillis();
		long gecenZaman = (bitisZamani - baslangicZamani) / 100;
		System.out.println(sayac + " soruyu, ");
		System.out.println(gecenZaman + " saniyede, ");
		System.out.println(dogruSayisi + " ' sı doğru olarak cevapladınız.");

	}

}
