package bolum.dort.sorular;

import java.util.Scanner;

public class BesgenAlan {

	public static void main(String[] args) {

		System.out.println("Beşgenin merkezinden köşesine kadar olan uzaklığı giriniz.");
		
		Scanner input = new Scanner(System.in);
		
		double koseyeOlanUzaklik = input.nextDouble();
		double kenarUzunluk = (2 * koseyeOlanUzaklik) * (Math.sin(3.14 / 5));
		double alan = (5 * kenarUzunluk * kenarUzunluk) / (4 * Math.tan(3.14 / 5));
		
		System.out.println("Beşgenin alanı: " + (int)(alan * 100) / 100.0);
	}

}
