package bolum.dort.sorular;

import java.util.Scanner;

public class DersSec {

	public static void main(String[] args) {

		System.out.println("Ders seçiniz.(M 1-2-3/T 1-2-3 / B 1-2-3)");
	
		Scanner input = new Scanner(System.in);
			String ders = input.nextLine();
			
			String m1 = "M1";
			String m2 = "M2";
			String m3 = "M3";
			String t1 = "T1";
			String t2 = "T2";
			String t3 = "T3";
			String b1 = "B1";
			String b2 = "B2";
			String b3 = "B3";
			if (ders.equals(m1)) {
				System.out.println("Matematiğe Giriş");
			} else if (ders.equals(m2)) {
				System.out.println("Matematik Analitik");
			} else if (ders.equals(m3)) {
				System.out.println("Matematik Çıkış");
			} else if (ders.equals(t1)) {
				System.out.println("Türkçe Giriş");
			} else if (ders.equals(t2)) {
				System.out.println("Türkçe Dilbilgisi");
			} else if (ders.equals(t3)) {
				System.out.println("Türkçe Dilbilim");
			} else if (ders.equals(b1)) {
				System.out.println("Bilgisayar Giriş");
			} else if (ders.equals(b2)) {
				System.out.println("Bilişim Teknolojileri");
			} else if (ders.equals(b3)) {
				System.out.println("Bilişim Uzmanlığı");
			} else {
			System.err.println("Hatalı giriş yaptınız.");	
			} 
			}
		}
		


