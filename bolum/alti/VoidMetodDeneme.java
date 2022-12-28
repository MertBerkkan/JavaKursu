package bolum.alti;

public class VoidMetodDeneme {
    public static void main(String[] args) {
     notYazdir(78.5);
     notYazdir(55.2);
    }
    public static void notYazdir(double puan){
        System.out.println("Notunuz : " + notGetir(puan));
    }
    public static char notGetir(double sayi) {
        if (sayi >= 90.0) {
            return 'A';
        } else if (sayi >= 80.0) {
            return 'B';
        } else if (sayi >= 70.0) {
            return 'C';
        } else if (sayi >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    

}
