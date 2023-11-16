import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Lütfen boyunuzu metre cinsinden (m.cm) girin:");
            boy = input.nextDouble();

            System.out.print("Lüften kilonuzu girin:");
            kilo = input.nextDouble();
        }

        endeks = kilo / ( boy *boy );

        System.out.println("Vücut kitle endeksiniz: " + endeks);

    }
}
