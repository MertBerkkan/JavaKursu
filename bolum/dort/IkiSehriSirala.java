package bolum.dort;

import java.util.Scanner;

public class IkiSehriSirala {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir şehir giriniz.");
		
		String sehir1 = input.next();
		
		System.out.println("Bir şehir daha giriniz");
		
		String sehir2 = input.next();
		
		if (sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("Şehirleri sıralı şekilde yazıyorum: " + sehir1 + " " + sehir2);
		}else {
			System.out.println("Şehirleri sıralı şekilde yazıyorum: " + sehir2 + " " + sehir1);
		}
		
		String str = sehir1;
		
		
		System.out.println(str.indexOf("i", 2));
		System.out.println(str.lastIndexOf("bul"));
		
	}

}
