package bolum.dort.sorular;

import java.util.Scanner;

public class SesliMi {

    public static void main(String[] args) {

        System.out.println("Bir harf giriniz.");
        Scanner input = new Scanner(System.in);

        String girdiharf = input.next();
        char harf = girdiharf.toLowerCase().charAt(0);

        if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'u' || harf == 'ü' || harf == 'o'
                || harf == 'ö') {
            System.out.println(girdiharf + " sesli harftir.");
        } else if ((harf >= 'a' && harf >= 'Z')) {
            System.out.println(girdiharf + " sessiz harftir.");
        } else {
            System.err.println("Hatalı giriş.");
        }

    }
}
