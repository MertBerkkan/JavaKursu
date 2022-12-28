package bolum.alti;

public class S36 {
    public static void main(String[] args) {
        int sayi = 100;
        int sutunSayi = 10;

        for (int i = 1; i <= sayi; i++){
            char ch = buyukHarfGetir();
            if (i % sutunSayi == 0){
                System.out.println(ch);
            }else {
                System.out.print(ch + "  ");
            }
        }

        System.out.println("\n---------------------------------------------------------------\n");

        for (int i = 1; i <= sayi; i++){
            char ch1 = rakamGetir();
            if (i % sutunSayi == 0){
                System.out.println(ch1);
            }else {
                System.out.print(ch1 + "  ");
            }
        }
    }

    private static char rakamGetir() {
        return rastgeleKarakterGetir('0', '9');
    }

    public static char buyukHarfGetir() {

        return rastgeleKarakterGetir('A', 'Z');
    }
    public static char rastgeleKarakterGetir (char x, char y){

        return (char)(x + Math.random() * (y - x + 1));
    }
}
