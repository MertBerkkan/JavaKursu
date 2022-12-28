package bolum.alti;

import java.util.Random;

public class S32 {

    static  Random rd = new Random();

    public static void main(String[] args) {
        int ilkZar = rd.nextInt(6) + 1;
        int ikiinciZar = rd.nextInt(6) + 1;
        craps(ilkZar, ikiinciZar);

    }
    public static void craps(int i, int y){

        int sayac = 0;
        int dogrusayaci = 0;
        int dogruSayaciIki = 0;
        while (sayac <= 10000){
            if (i + y == 7 || i + y == 11){
                dogruSayaciIki++;
            } else if (i + y == 2 || i + y == 3 || i + y == 12) {
            }else {
                int toplam = i + y;

                i = rd.nextInt(6) + 1;
                y = rd.nextInt(6) + 1;
                if (i + y == 7){
                }else if(i + y == toplam) {
                    dogrusayaci++;
                }
            }

            sayac++;
        }
        System.out.println((dogrusayaci + dogruSayaciIki) + " kere kazandınız.");
    }
}
