package bolum.bes.sorular;

public class S39 {
    public static void main(String[] args) {

        final double ilkKomisyonOrani = 0.08;
        final double ikinciKomisyonOrani = 0.1;
        final double sonKomisyonOrani = 0.12;

        double satisTutari = 0;
        double komisyonTutari = 0;

        while (komisyonTutari < 30000){
            if (satisTutari <= 5000 && satisTutari > 0.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani;
            } else if (satisTutari <= 10000 && satisTutari >= 5000.01) {
                komisyonTutari = satisTutari * ilkKomisyonOrani + (satisTutari - 5000) * ikinciKomisyonOrani;
            } else if (satisTutari >= 10000.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani + satisTutari * ilkKomisyonOrani + (satisTutari - 10000) * sonKomisyonOrani;
            }
            satisTutari += 0.01;
        }
        System.out.println("Yılda 30.000 lira kazanmak için yapmak gereken satış miktarı : " + (int)((satisTutari - 0.01) * 100) / 100);
        }
    }

