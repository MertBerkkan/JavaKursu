package bolum.dort;

import java.util.Scanner;

public class Bolum04Deneme {

	public static void main(String[] args) {
		System.out.println("Bir cümle yazınız.");

		Scanner input = new Scanner(System.in);
		String yazi = input.nextLine();
		
		System.out.println(yazi.length());
		System.out.println(yazi.concat(yazi));
		System.out.println(yazi.toLowerCase());
		System.out.println(yazi.toUpperCase());
		System.out.println(yazi.trim());
		
		
	}

}
