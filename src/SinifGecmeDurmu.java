import java.util.Scanner;

public class SinifGecmeDurmu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int mat, turkce, muzik, fizik, kimya;

            System.out.print("Matematik notunuzu girin:");
            mat = input.nextInt();

            System.out.print("Türkçe notunuzu girin:");
            turkce = input.nextInt();

            System.out.print("Müzik notunuzu girin:");
            muzik = input.nextInt();

            System.out.print("Fizik notunuzu girin:");
            fizik = input.nextInt();

            System.out.print("Kimya notunuzu girin:");
            kimya = input.nextInt();

            double average = (
                (mat <= 100 && mat >= 0 ? mat : 0)+
                (turkce <= 100 && turkce >= 0 ? turkce : 0)+
                (muzik <= 100 && muzik >= 0 ? muzik : 0)+
                (fizik <= 100 && fizik >= 0 ? fizik : 0)+
                (kimya <= 100 && kimya >= 0 ? kimya : 0)
            ) / 5;

            System.out.println("Ortalamanız: " + average);
        }
    }
}
