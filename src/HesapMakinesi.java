import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n1, n2, select;

            System.out.print("Birinci sayıyı girin: ");
            n1 = input.nextInt();

            System.out.print("İkinci sayıyı girin: ");
            n2 = input.nextInt();

            System.out.println("İşlem Seçin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Toplam: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Fark: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Çarpım: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Bölüm: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız!");
                    break;
            }
        }

    }
}
