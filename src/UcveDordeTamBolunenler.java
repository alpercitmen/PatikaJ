import java.util.Scanner;

public class UcveDordeTamBolunenler {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int sayi, ortalama, toplam = 0, sayac = 0;

            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    System.out.println("Sayı: " + i);
                    toplam += i;
                    sayac++;
                }
            }
            ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);

            input.close();
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        }
    }
}
