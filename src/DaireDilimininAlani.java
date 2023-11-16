import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int r, a;
            double dilimAlan, pi = 3.14;
            System.out.print("Dairenin yarışapını girin (r):");
            r = input.nextInt();

            System.out.print("Merkez açıyı girin(a):");
            a = input.nextInt();

            dilimAlan = (pi * (r*r) *a) / 360;
            System.out.println("Daire diliminin alanı: " + dilimAlan);
            System.out.println("Dairenin alanı: " + pi * r * r);
            System.out.println("Dairenin çevresi: " + 2 * pi * r);
        }

    }
}
