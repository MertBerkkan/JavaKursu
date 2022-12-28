package bolum.dort.sorular;

import java.util.Scanner;

public class SNGirisKontrol {
	public static void main(String[] args) {

		System.out.println("SN numaranızı giriniz. Örnek : RRR-RR-RRRR");

		Scanner input = new Scanner(System.in);
		String snNumarasi = input.next();

		if ((snNumarasi.charAt(3) == '-') && (snNumarasi.charAt(6) == '-')) {
			System.out.println(snNumarasi + " giriş şekli uygun girilmiştir.");
		} else {
			System.err.println(snNumarasi + " giriş şekli yanlıştır.");
			System.out.println("RRR-RR-RRRR şeklinde olmalıdır.");
		}
	}
}
