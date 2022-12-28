package bolum.alti;

import java.util.Random;

public class S30 {
    public static void main(String[] args) {
        Random rd = new Random();
        int ilkZar = rd.nextInt(6) + 1;
        int ikiinciZar = rd.nextInt(6) + 1;
        craps(ilkZar, ikiinciZar);

    }
    public static void craps(int i, int y){

        Random rd = new Random(7);
        int sayac = 1;
        while (sayac > 0){
            if (i + y == 7 || i + y == 11){
                System.out.println(i + " + " + y + " = " + (i + y));
                System.out.println("Tebrikler kazandınız.");
                break;
            } else if (i + y == 2 || i + y == 3 || i + y == 12) {
                System.out.println(i + " + " + y + " = " + (i + y));
                System.out.println("Kaybettiniz.");
                break;
            }else {
                int toplam = i + y;
                System.out.println(i + " + " + y + " = " + (i + y));
                System.out.println("Tekrar zar atılıyor.");
                i = rd.nextInt(6) + 1;
                y = rd.nextInt(6) + 1;
                if (i + y == 7){
                    System.out.println(i + " + " + y + " = " + (i + y));
                    System.out.println("Kaybettiniz.");
                    break;
                }else if(i + y == toplam) {
                    System.out.println(i + " + " + y + " = " + (i + y));
                    System.out.println("Tebrikler kazandınız.");
                    break;
                }
            }

        }
    }
}
