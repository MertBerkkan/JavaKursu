package bolum.bes.sorular;

public class S24 {
    public static void main(String[] args) {
        float toplam = 0;

        for (float i = 1, j = 3; i <= 97; i += 2, j += 2){
            float kesir = i / j;
            toplam = toplam + kesir;
        }
        System.out.println(toplam);
    }
}
