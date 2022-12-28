package bolum.dort.sorular;

import java.util.Scanner;

public class IcindeVarMi {

	public static void main(String[] args) {

		System.out.println("Bir kelime giriniz.");
		Scanner input = new Scanner(System.in);
		String kelimebir = input.next();

		System.out.println("Bir kelime daha giriniz.");
		String kelimeiki = input.next();

		if (kelimebir.indexOf(kelimeiki) >= 0) {
			System.out.println(kelimebir + "'ın içinde " + kelimeiki + " vardır.");
		} else {
			System.out.println(kelimebir + "'ın içinde " + kelimeiki + " yoktur.");
		}

	}

}
