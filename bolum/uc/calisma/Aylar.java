package bolum.uc.calisma;

import java.util.Map;
import java.util.Scanner;

public class Aylar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Bugünün ne olduğunu giriniz.Pazartesi :1 / pazar : 7");
		int gun = input.nextInt();

		System.out.println("Bugünden kaç gün sonrayı öğrenmek istersiniz.");
		int sonra = input.nextInt();

		String yaziylaBugun = gunuBelirle(gun);

		int songun = (sonra % 7);

		String yaziylaSonGun = gunuBelirle(songun);
		
		System.out.println("Bugün: " +yaziylaBugun + " gelecekteki gün: " + yaziylaSonGun);
		Map < Integer, String > gunMap = Map.of(1, "Pazartesi", 2, "Salı", 3, "Çarş");
		
		System.out.println(gunMap.get(gun));
	}

	public static String gunuBelirle(int mert) {
		switch (mert) {
		case 1:
			return "Pazartesi";
		case 2:
			return "Salı";
		case 3:
			return "Çarşamba";
		case 4:
			return "Perşembe";
		case 5:
			return "Cuma";
		case 6:
			return "cumartesi";
		case 7:
			return "Pazar";
		default:
			return "Hafta bolum.yedi gündür";
		}

	}

}
