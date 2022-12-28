package bolum.bes.sorular;

public class S18 {
    public static void main(String[] args) {
        int sayi = 6;
        int bosluk = 1;
        int bosluIki = 6;
        int boslukUc = 1;
        int boslukDort = 6;

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < bosluk; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            bosluk++;
        }
        System.out.println("------------------------------------------------------------");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= bosluIki; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            bosluIki--;
        }
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j > boslukUc) {
                    System.out.print("  ");
                } else {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
            boslukUc++;
        }
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= sayi; i++){
            for (int j = 1,k = 6; j <= boslukDort; k--){
                if (k <= boslukDort){
                    System.out.print(j +" ");
                    j++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            boslukDort--;
        }

    }
}

