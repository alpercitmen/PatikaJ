import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, startPrice = 10, totalPrice, minPrice = 20;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mesafeyi KM cinsinden girin: ");
            km = input.nextInt();
        }
        totalPrice = startPrice + (km * perKM);
        if ( totalPrice <= minPrice ) {
            totalPrice = 20;
        }

        System.out.println("Taksimetre ücreti: " + totalPrice);

    }
}
