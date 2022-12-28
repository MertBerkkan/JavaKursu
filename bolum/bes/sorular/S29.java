package bolum.bes.sorular;

import java.util.Scanner;

public class S29 {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int yil = klavye.nextInt();

        if (yil <= 0){
            System.out.println("Hata : 0'dan sonraki yılları girin.");
            System.exit(0);
        }

        System.out.println("Yılın ilk gününü giriniz.(Pazartesi : 1 - Salı : 2 vb.");
        int gun = klavye.nextInt();

          String ayAdi ;
          int ay = 1;

          while (ay <= 12){
              if (ay == 1) {
                  ayAdi = "Ocak";
              } else if (ay == 2){
                  ayAdi = "Şubat";
              } else if (ay == 3){
                  ayAdi = "Mart";
              } else if (ay == 4){
                  ayAdi = "Nisan";
              } else if (ay == 5){
                  ayAdi = "Mayıs";
              } else if (ay == 6){
                  ayAdi = "Haziran";
              } else if (ay == 7){
                  ayAdi = "Temmuz";
              } else if (ay == 8){
                  ayAdi = "Ağustos";
              } else if (ay == 9){
                  ayAdi = "Eylül";
              } else if (ay == 10){
                  ayAdi = "Ekim";
              } else if (ay == 11){
                  ayAdi = "Kasım";
              } else{
                  ayAdi = "Aralık";
              }

              System.out.println("\n\t\t" + ayAdi + " " + yil);
              System.out.println("-------------------------");
              System.out.println("PT\tS\tÇ\tP\tC\tCT\tP");

              String gunler ;
              int baslangicDizini;

              switch (gun) {
                  case 1 : gunler = " "; baslangicDizini = 0; break;
                  case 2 : gunler = "\t"; baslangicDizini = 1; break;
                  case 3 : gunler = "\t\t"; baslangicDizini = 2; break;
                  case 4 : gunler = "\t\t\t"; baslangicDizini = 3; break;
                  case 5 : gunler = "\t\t\t\t"; baslangicDizini = 4; break;
                  case 6 : gunler = "\t\t\t\t\t"; baslangicDizini = 5; break;
                  default: gunler = "\t\t\t\t\t\t"; baslangicDizini = 6;
              }

              int ayinSonGunu ;

              if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12){
                  ayinSonGunu = 31;
              } else if (ay == 2){
                  if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
                      ayinSonGunu = 29;
                  }else {
                      ayinSonGunu = 28;
                  }
              }else {
                  ayinSonGunu = 30;
              }

              int aydakiGunler ;
              for (aydakiGunler = 1; aydakiGunler <= ayinSonGunu; aydakiGunler++, baslangicDizini++){
                  gunler += aydakiGunler + (((baslangicDizini + 1) % 7 == 0) ? "\n" : "\t");
              }
              System.out.println(gunler + "\n");
              gun = (1 + (gun + ayinSonGunu - 1) % 7);
              ay++;
          }

    }
}
