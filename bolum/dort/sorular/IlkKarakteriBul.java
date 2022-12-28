package bolum.dort.sorular;

import java.util.Scanner;

public class IlkKarakteriBul {

	public static void main(String[] args) {

		System.out.println("Bir şeyler yazın.");
	    
		Scanner input = new Scanner(System.in);
		String girilen  = input.next();
		
		char ilkKarakter = girilen.charAt(0);
		
		System.out.println("Yazınız " + girilen.length());
		System.out.println("Yazınızın ilk karakteri " + ilkKarakter);
	
	}

}
