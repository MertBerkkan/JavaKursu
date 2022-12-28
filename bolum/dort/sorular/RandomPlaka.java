package bolum.dort.sorular;

import java.util.Random;

public class RandomPlaka {

	public static void main(String[] args) {

		int sayi = new Random().nextInt((8999) + 1) + 1000;

		int harfsayisi = new Random().nextInt(26) + 65;
		char harf = (char) harfsayisi;

		int harfsayisi2 = new Random().nextInt(26) + 65;
		char harf2 = (char) harfsayisi2;

		int harfsayisi3 = new Random().nextInt(26) + 65;
		char harf3 = (char) harfsayisi3;

		int harfsayisi4 = new Random().nextInt(26) + 65;
		char harf4 = (char) harfsayisi4;

		System.out.println("Plakanız: " + sayi + harf + harf4 + harf2 + harf3);

	}

}
