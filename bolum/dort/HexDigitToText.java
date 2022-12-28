package bolum.dort;

import java.util.Scanner;

public class HexDigitToText {

	public static void main(String[] args) {
System.out.println("Bir hex sayı giriniz.");
		Scanner input = new Scanner(System.in);
		
		String girdi = input.next();
		if (girdi.length() != 1) {
			System.err.println("Tek karakter girilmeliydi.");
			System.exit(0);
		} 
		
		char ch = girdi.toLowerCase().charAt(0);
		int sayi = 0;
		
		if ('a' <= ch && ch <= 'z') {
			sayi = ch - 'a' + 10;
		} else if ('0' <= ch && ch <= '9') {
			sayi = ch - '0';
		}else {
			System.err.println("Hatalı giriş");
		}
		
		System.out.println("Hex " + ch + " nin değer: " + sayi);
	}
	

}
