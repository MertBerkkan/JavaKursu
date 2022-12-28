package bolum.dort;

import java.util.Scanner;

public class UcgeninAcilariHesapla {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Üç nokta giriniz.");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.sqrt((x2- x3) * (x2 - x3) + (y2 - y3) * (y2- y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		double a1 = Math.toDegrees(Math.acos((a * a - b * a - c * c) / (-2 * b * c)));
		double b1 = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double c1 = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		System.out.println("1. açı: " + Math.round(a1 * 100) / 100.0);
		System.out.println("2. açı: " + Math.round(b1 * 100) / 100.0);
		System.out.println("3. açı: " + Math.round(c1 * 100) / 100.0);
	}

}
