import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, total;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Kaç kilo armut istiyorsunuz?:");
            armutKg = input.nextInt();

            System.out.print("Kaç kilo elma istiyorsunuz?:");
            elmaKg = input.nextInt();

            System.out.print("Kaç kilo domates istiyorsunuz?:");
            domatesKg = input.nextInt();

            System.out.print("Kaç kilo muz istiyorsunuz?:");
            muzKg = input.nextInt();

            System.out.print("Kaç kilo patlıcan istiyorsunuz?:");
            patlicanKg = input.nextInt();
        }

        total = ( (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg) );

        System.out.println("Toplam tutar:" + total + "TL");
        
    }
}
