import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik, tarih;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notunuzu girin: ");
            mat = input.nextInt();
            
            System.out.println("Türkçe notunuzu girin: ");
            turkce = input.nextInt();
            
            System.out.println("Fizik notunuzu girin: ");
            fizik = input.nextInt();
            
            System.out.println("Kimya notunuzu girin: ");
            kimya = input.nextInt();
            
            System.out.println("Müzik notunuzu girin: ");
            muzik = input.nextInt();
            
            System.out.println("Tarih notunuzu girin: ");
            tarih = input.nextInt();
        }
        
        int toplam = (mat+turkce+fizik+kimya+muzik+tarih);
        double ortalama = toplam / 6;

        System.out.println("Ortalama: " + ortalama);

        System.out.println( (ortalama >= 60) ? "Geçti!" : "Kaldı!" );
        
    }
}
