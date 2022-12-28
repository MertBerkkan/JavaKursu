package bolum.dort;

public class StringKiyas {

	public static void main(String[] args) {

		String str1 = "Merhaba JAva";
		String str2 = "  MerhAba JAva ";
		
		
		System.out.println(str1.startsWith("mer"));
		System.out.println(str1.endsWith("va"));
		System.out.println(str1.contains("ba"));

		boolean b = str1.equalsIgnoreCase(str2.trim());
		if (b) {
			System.out.println("İki String birbirine eşit.");
		} else {
			System.out.println("İki String birbirine eşit değil.");
		}

		str1 = "java";
		str2 = "java";
		int kiyaslamaDegeri = str1.compareTo(str2);
		if (kiyaslamaDegeri == 0) {
			System.out.println(str1 + " eşittir " + str2);
		} else if (kiyaslamaDegeri > 0) {
			System.out.println(str1 + " büyüktür " + str2);
		} else {
			System.out.println(str1 + " küçüktür " + str2);
		}

	}

}
