package bolum.dort.sorular;

import java.util.Scanner;

public class AltigenAlan {

	public static void main(String[] args) {

		System.out.println("Altıgenin bir kenar uzunluğunu yazınız.");

		Scanner input = new Scanner(System.in);

		double kenar = input.nextDouble();
		double alan = (6 * (kenar * kenar)) / (4 * Math.tan(3.14 / 6));

		System.out.println("Altıgenin alanı: " + alan);

	}

}
