package bolum.bes.sorular;

import java.util.Scanner;

public class S42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Komisyonlar sonucu biy yılda toplanması gereken parayı giriniz.");

        double para = input.nextDouble();

        final double ilkKomisyonOrani = 0.08;
        final double ikinciKomisyonOrani = 0.1;
        final double sonKomisyonOrani = 0.12;

        double satisTutari = 0;

        for (double komisyonTutari = 0; komisyonTutari < para; ){
            if (satisTutari <= 5000 && satisTutari > 0.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani;
            } else if (satisTutari <= 10000 && satisTutari >= 5000.01) {
                komisyonTutari = satisTutari * ilkKomisyonOrani + (satisTutari - 5000) * ikinciKomisyonOrani;
            } else if (satisTutari >= 10000.01){
                komisyonTutari = satisTutari * ilkKomisyonOrani + satisTutari * ilkKomisyonOrani + (satisTutari - 10000) * sonKomisyonOrani;
            }
            satisTutari += 0.01;
        }
        System.out.println("Yılda " + (int)para + " lira kazanmak için yapmak gereken satış miktarı : " + (int)((satisTutari - 0.01) * 100) / 100);
        }
    }

