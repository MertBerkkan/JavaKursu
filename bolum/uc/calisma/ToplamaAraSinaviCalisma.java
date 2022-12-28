package bolum.uc.calisma;

import java.util.Scanner;

public class ToplamaAraSinaviCalisma {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		

		
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		int sayi3 = (int)(Math.random() * 10);
		

		
		
		System.out.println(sayi1 + " + " + sayi2 + " + " + sayi3 + " = ?;");
		
		int toplam = girdi.nextInt();
		
		if (sayi1 + sayi2 + sayi3 == toplam) {
		
		System.out.println("Doğru cevap"); 
		}else { System.out.println("Yanlış cevap");
		}
		
	}

}
