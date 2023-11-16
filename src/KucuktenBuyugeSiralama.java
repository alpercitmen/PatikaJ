import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Birinci sayıyı girin(a):");
            a = input.nextInt();

            System.out.println("İkinci sayıyı girin(b):");
            b = input.nextInt();

            System.out.println("Üçüncü sayıyı girin(c):");
            c = input.nextInt();

            if (a == b && a < c) {
                System.out.println(a + " (a) = " + b + " (b) < " + c + " (c)");
            } else if (a == b && a > c) {
                System.out.println(a + " (a) = " + b + " (b) > " + c + " (c)");
            } else if (a == c && a < b) {
                System.out.println(a + " (a) = " + c + " (c) < " + b + " (b)");
            } else if (a == c && a > b) {
                System.out.println(a + " (a) = " + c + " (c) > " + b + " (b)");
            } else if (b == c && b < a) {
                System.out.println(b + " (b) = " + c + " (c) < " + a + " (a)");
            } else if (b == c && b > a) {
                System.out.println(b + " (b) = " + c + " (c) > " + a + " (a)");
            } else {
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(a + " (a) < " + b + " (b) < " + c + " (c)");
                    } else {
                        System.out.println(a + " (a) < " + c + " (c) < " + b + " (b)");
                    }
                } else if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(b + " (b) < " + a + " (a) < " + c + " (c)");
                    } else {
                        System.out.println(b + " (b) < " + c + " (c) < " + a + " (a)");
                    }
                } else if (c < a && c < b) {
                    if (a < b) {
                        System.out.println(c + " (c) < " + a + " (a) < " + b + " (b)");
                    } else {
                        System.out.println(c + " (c) < " + b + " (b) < " + a + " (a)");
                    }
                } else if (a == b && a == c) {
                    System.out.println("Sayılar eşit.");
                }
            }

        }

    }
}
