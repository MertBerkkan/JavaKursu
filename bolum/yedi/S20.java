package bolum.yedi;

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizinizin eleman sayısını giriniz.");

        int elemanSayisi = input.nextInt();

        int[] dizi = new int[elemanSayisi];

        diziAta(input, dizi);

        if (ardisikdortesSayiMi(dizi)){
            System.out.println("Dizinizde dört ardışık eş sayı vardır.");
        }else {
            System.out.println("Dizinizde dört ardışık eş sayı yoktur.");
        }
    }

    public static boolean ardisikdortesSayiMi(int[] dizi) {
        for (int i = 0; i < dizi.length - 3; i++){
            for (int j = 1; j < dizi.length; j++){
                if (dizi[i] == dizi[j] && dizi[i] == dizi[j +1] && dizi[i] == dizi[j +2]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void diziAta(Scanner input, int[] dizi) {
        System.out.println("Dizi elemanlarını giriniz.");
        for (int i = 0; i < dizi.length; i++){
            dizi[i] = input.nextInt();
        }
    }
}
