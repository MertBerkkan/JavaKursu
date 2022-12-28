package bolum.dort.sorular;

import java.util.Scanner;

public class S14 {

	public static void main(String[] args) {

		System.out.println("Harf giriniz.(A, B, C, D, F");
		Scanner input = new Scanner(System.in);
		String girdiHarf = input.next();
		char harf = girdiHarf.toLowerCase().charAt(0);
	    
		if ('a' <= harf && harf <= 'f') {
		int sayi = harf - 'a' + 1;
			System.out.println(harf + ": " + sayi);	
		}
		}

}
