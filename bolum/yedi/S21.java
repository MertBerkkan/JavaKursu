package bolum.yedi;

import java.util.Arrays;
import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\tİKİ DİZİYİ BİRLEŞTİRME\n Dizilerinizin eleman sayılarını giriniz.\n Dizi 1: ");

        int dizi1ElemanSayisi = input.nextInt();

        System.out.println("Dizi 2 :");

        int dizi2ElemanSayisi = input.nextInt();

        int[] dizi1 = new int[dizi1ElemanSayisi];
        int[] dizi2 = new int[dizi2ElemanSayisi];

        diziyeSayiAta(input, dizi1);
        diziyeSayiAta(input, dizi2);
        int[] diziBirlesik = new int[dizi1ElemanSayisi + dizi2ElemanSayisi];
        diziBirlesik = dizileriBirlestir(dizi1, dizi2);
        Arrays.sort(diziBirlesik);
        System.out.println(Arrays.toString(diziBirlesik));

    }

    private static int[] dizileriBirlestir(int[] dizi1, int[] dizi2) {
        int[] diziBirlesik = new int[dizi1.length + dizi1.length - 2];
        for (int i = 0; i < diziBirlesik.length; i++){
            if (i < dizi1.length){
                diziBirlesik[i] = dizi1[i];
            }else {
                diziBirlesik[i] = dizi2[i - dizi1.length];
            }
        }
        return diziBirlesik;
    }

    public static void diziyeSayiAta(Scanner input, int[] dizi) {
        System.out.println("Dizinizi giriniz: ");

        for (int i = 0; i < dizi.length; i++){
            dizi[i] = input.nextInt();
        }
    }
}
