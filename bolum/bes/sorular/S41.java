package bolum.bes.sorular;

import java.util.Scanner;

public class S41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int max = 0;
        int tekrar = 1;

        while (sayi != 0){
            if (sayi > max){
                max = sayi;
                tekrar = 1;
            }else if (sayi == max){
                tekrar++;
            }
            sayi = input.nextInt();
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("Tekrar sayısı : " + tekrar);

    }
}
