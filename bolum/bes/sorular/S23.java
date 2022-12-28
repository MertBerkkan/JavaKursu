package bolum.bes.sorular;

public class S23 {
    public static void main(String[] args) {

        float toplam = 0;
        float toplamIki = 0;
        for (float i= 1; i <= 50000; i++){
            float n = 1 / i;
          toplam = toplam + n;
    }
        System.out.println("Soldan sağa toplama:");
        System.out.println(toplam);

        for (float i = 50000; i >=1; i--){
            float m = 1 / i;
            toplamIki = toplamIki + m;
        }
        System.out.println("Sağdan sola toplama:");
        System.out.println(toplamIki);
    }
}
