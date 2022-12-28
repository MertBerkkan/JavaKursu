package bolum.bes.sorular;

public class S19 {
    public static void main(String[] args) {
        int yukseklik = 8;
        int bosluk = 1;

        for (int i = yukseklik; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("    ");
            }
            for (int k = 1; k <= bosluk; k *= 2){
                if (k < 10){
                    System.out.print("   " + k);
                }else if(k < 100 && k > 10){
                System.out.printf("  %2d", k);
            }else{
                    System.out.printf(" %2d", k);
                }
            }
            for (int l = bosluk / 2; l >= 1; l /= 2){
                if (l < 10){
                    System.out.print("   " +l);
                }else{
                    System.out.printf("  %d",l);
            }}
            System.out.println();
            bosluk *= 2;}
    }
}
