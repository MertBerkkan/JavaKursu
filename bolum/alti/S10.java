package bolum.alti;

public class S10 {
    public static void main(String[] args) {

        int sayac = 0;
        for (int asal = 1; asal <= 10000; asal++) {
            if (asalMi(asal)){
                if (sayac % 10 == 0){
                    System.out.println();
                }else {
                    System.out.printf("%4d ", asal);
                }
                sayac++;
            }
        }
    }

    public static boolean asalMi(int s) {

        for (int i = 2; i < s; i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }
}
