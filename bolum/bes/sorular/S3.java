package bolum.bes.sorular;

public class S3 {

    public static void main(String[] args) {

        double pound = 2.2;

        double kilogram = 0.48;
        System.out.println("Kilogram\tPound\t|\tPound\tKilogram");

        for (int kg =1; kg < 200; kg += 2){
            for(int pd = 20; pd < 516; pd +=5){
                System.out.println(kg + "\t" + kg * pound + "\t|\t" + pd + "\t" + pd * kilogram );
            }
    }
}}
