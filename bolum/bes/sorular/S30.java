package bolum.bes.sorular;

import java.util.Scanner;

public class S30 {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Aylık biriktirme tutarı: ");
        int aylikGirenPara = klavye.nextInt();
        System.out.print("Yıllık faiz oranı : ");
        double yillikFaiz = klavye.nextDouble();
        System.out.print("Ay sayısı : ");
        int ay = klavye.nextInt();

        double aylikFaizOrani = (yillikFaiz / 100) / 12;
        double birikenMiktar = 0;
        for (int i = 1; i <= ay; i++){

            birikenMiktar = (birikenMiktar + aylikGirenPara) * (1 + aylikFaizOrani);

        }
        System.out.println("Toplam ay : " + ay);
        System.out.println("Hesabınızdaki birikim tutarı : " + (int)((birikenMiktar * 100) / 100));
    }
}
