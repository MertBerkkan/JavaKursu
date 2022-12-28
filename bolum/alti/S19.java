package bolum.alti;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenarl uzunluklarını giriniz." +
                "\n(Kenar uzunluğunun toplamı diğerinden büyük olmalıdır.)");

        System.out.print("1.Kenar: ");
        double ilkKenar = input.nextInt();

        System.out.print("2.Kenar: ");
        double ikinciKenar = input.nextInt();

        System.out.print("3.Kenar: ");
        double ucuncuKenar = input.nextInt();

       double ucgeninAlani = ucgenAlanHesapla(ilkKenar, ikinciKenar, ucuncuKenar);

       if (ucgeninAlani == 0){
           System.out.println("Kenar uzunluklarını hatalı girdiniz.");
       }else {
           System.out.println(ilkKenar + " " + ikinciKenar + " " + ucuncuKenar + " kenar uzunlukları olan üçgeniz alanı : " + ucgeninAlani);
       }
    }

    private static double ucgenAlanHesapla(double ilkKenar, double ikinciKenar, double ucuncuKenar) {
        if (kenarUzunlukKontrol(ilkKenar, ikinciKenar, ucuncuKenar)){
            double s = (ilkKenar + ikinciKenar + ucuncuKenar) / 2;
            return Math.sqrt(s * (s - ilkKenar) * (s - ikinciKenar) * (s - ucuncuKenar));
        }
        return 0;
    }

    private static boolean kenarUzunlukKontrol(double ilkKenar, double ikinciKenar, double ucuncuKenar) {
        return ilkKenar + ikinciKenar > ucuncuKenar || ikinciKenar + ucuncuKenar > ilkKenar || ilkKenar + ucuncuKenar > ikinciKenar;
    }
}
