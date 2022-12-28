package bolum.bes.sorular;

public class S27 {
    public static void main(String[] args) {
        int sayac = 1;

        for (int yil = 101; yil <= 2100; yil++){
            if (yil % 4 == 0){
                if (sayac % 10 == 0){
                    if (yil < 1000) {
                        System.out.println(" " + yil);
                    }else {
                        System.out.println(yil);
                    }
                } else {
                    if (yil < 1000) {
                        System.out.print(" " + yil + " ");
                    }else {
                        System.out.print(yil + " ");
                    }
                }
                sayac++;
            }
        }
        System.out.println("Toplamda " + sayac + " artık yıl vardır.");

    }
}
