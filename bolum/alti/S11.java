package bolum.alti;

public class S11 {
    public static void main(String[] args) {

        System.out.println("SATIŞ MİKTARI\tKOMİSYON");
        System.out.println("--------------------------------");

        for (double satisTutari = 10000; satisTutari <= 100000; satisTutari += 5000) {

            System.out.println((int)satisTutari + "\t\t\t" + komisyonGetir(satisTutari));
        }

    }


    public static double komisyonGetir (double satisTutari) {

        final double ilkKomisyonOrani = 0.08;
        final double ikinciKomisyonOrani = 0.1;
        final double sonKomisyonOrani = 0.12;

        double komisyonTutari = 0;

            if (satisTutari <= 5000 && satisTutari > 0.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani;
            } else if (satisTutari <= 10000 && satisTutari >= 5000.01) {
                komisyonTutari = satisTutari * ilkKomisyonOrani + (satisTutari - 5000) * ikinciKomisyonOrani;
            } else if (satisTutari >= 10000.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani + satisTutari * ilkKomisyonOrani + (satisTutari - 10000) * sonKomisyonOrani;
            }
         return komisyonTutari;
        }
    }

