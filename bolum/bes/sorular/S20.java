package bolum.bes.sorular;

public class S20 {
    public static void main(String[] args) {
        int satirsayi = 8;
        for (int sayi = 2, sayac = 0; sayi <= 1000; sayi++){
            int kontrol = 0;
            for (int i = 2; i < sayi; i++){
                if (sayi % i == 0){
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0){
                sayac++;
                if (sayac % satirsayi == 0){
                    if (sayi > 100){
                    System.out.println(sayi);
                }else {
                        System.out.println(" " + sayi);
                    }
                }else {
                    if (sayi < 10){
                        System.out.print("  " + sayi + " ");
                    } else if (sayi < 100) {
                        System.out.print(" " + sayi +" ");
                    }else {
                        System.out.print(sayi + " ");
                    }
                }

            }
        }
    }
}
