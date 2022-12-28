package bolum.alti;

public class S26 {
    public static void main(String[] args) {
        int polindromSayac = 0;
        int sayi = 1;

        System.out.println("\t\tASAL VE POLİNDROM SAYILAR");
        System.out.println("--------------------------------------------------------------------");

        while (polindromSayac <= 100){
            if(asalMi(sayi)){
                if (polindromSayac % 4 == 0){
                    System.out.println();
                }else {
                    System.out.printf("%4d ",sayi);
                }
                polindromSayac++;
            }
            sayi++;

        }
    }

    private static boolean polindromMu(int sayi) {
        String plndrmSayi = String.valueOf(sayi);

        for (int i = 0, j = plndrmSayi.length() -1 ; i <= j; i++, j--) {
            char ch1 = plndrmSayi.charAt(i);
            char ch2 = plndrmSayi.charAt(j);
            if (ch1 == ch2) {
                return true;
            }
        }
            return false;

    }

        public static boolean asalMi ( int s){

            for (int i = 2; i < s; i++) {
                if (s % i == 0) {
                    return false;
                }
            }
            return polindromMu(s);
        }
    }

