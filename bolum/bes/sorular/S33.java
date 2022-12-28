package bolum.bes.sorular;

public class S33 {
    public static void main(String[] args) {
        for (int sayi = 5; sayi <= 10000; sayi++){
            int toplam = 0;
            for (int i = 1; i < sayi;i++){
                if (sayi % i == 0){
                    toplam +=i;
                }
            }
            if (toplam == sayi){
                System.out.println(sayi);
            }
        }
    }
}
