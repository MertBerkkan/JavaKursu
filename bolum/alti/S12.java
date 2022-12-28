package bolum.alti;

public class S12 {
    public static void main(String[] args) {

        char ch1 = '1';
        char ch2 = 'z';
        int satirSayi = 10;

        charYazdir(ch1, ch2, satirSayi);

    }

    private static void charYazdir(char ch1, char ch2, int satirSayi) {
        int sayac = 0;

        for (int i = (int)ch1 - 1; i <= (int)ch2; i++){
            if (sayac % satirSayi == 0){
                System.out.println();
            }else {
                System.out.print(" " + (char)i);
            }
            sayac++;
        }
    }
}
