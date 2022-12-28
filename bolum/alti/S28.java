package bolum.alti;

public class S28 {
    public static void main(String[] args) {
        int sayi = 2;

        System.out.println("P\t\t\t2*p - 1");
        System.out.println("--------------------------");

            while (sayi <= 31) {

                if (asalMi(sayi)) {
                    System.out.println(sayi + "\t\t\t" + (int)(Math.pow(2,sayi) - 1));
                }
                sayi++;
            }

        }
    private static boolean asalMi(int sayi) {

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
