import java.util.Scanner;

public class UcveDordeTamBolunenler {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int sayi, ortalama, toplam = 0, sayac = 0;

            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            for (sayi = 1; sayi <= 100; sayi++) {
                if (sayi % 3 == 0 && sayi % 4 == 0) {
                    toplam += sayi;
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
