import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double a, b, c, u, alan, alanSqrt;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Üçgenin birinci kenarının uzunluğunu girin: ");
            a = input.nextDouble();

            System.out.println("Üçgenin ikinci kenarının uzunluğunu girin: ");
            b = input.nextDouble();

            System.out.println("Üçgenin üçüncü kenarının uzunluğunu girin: ");
            c = input.nextDouble();
        }

        u = (a+b+c) / 2;
        alanSqrt = u * ( u - a ) * ( u - b ) * ( u - c );
        alan = Math.sqrt(alanSqrt);

        System.out.println("Üçgenin çevresi: " + u*2);
        System.out.println("Üçgenin alanı: " + alan);
        
    }
}
