package bolum.iki;

import java.util.Scanner;

public class Zaman {

	public static void main(String[] args) {
		
		System.out.println("Saniye cinsinden cevirilecek sayıyı giriniz");
		
		Scanner klavye = new Scanner(System.in);
		
		int saniye = klavye.nextInt();
		int dakika = saniye / 60;
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye+ " saniye " + dakika + " dakika " + kalanSaniye + " saniyedir ");
		
		
		
		

		
	}



}
