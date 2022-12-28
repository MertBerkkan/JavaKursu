package bolum.yedi;

public class BinaryArama {
    public static int binaryArama(int[] liste , int sayi){
        int dusuk = 0;
        int yuksek = liste.length - 1;

        while (yuksek >= dusuk){
            int orta = (yuksek + dusuk) / 2;
            if (sayi < liste[orta]){
                yuksek = orta - 1;
            } else if (sayi == liste[orta]) {
                return orta;
            }else {
                dusuk = orta + 1;
            }
        }
        return -1;
    }
}
