import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CinZodyakBurc {
    public static void main(String[] args) throws Exception {
        int dogum_yili, burcIndex = 0;

        Map<Integer, String> burclar = new HashMap<>();
        burclar.put(0, "Maymun");
        burclar.put(1, "Horoz");
        burclar.put(2, "Köpek");
        burclar.put(3, "Domuz");
        burclar.put(4, "Fare");
        burclar.put(5, "Öküz");
        burclar.put(6, "Kaplan");
        burclar.put(7, "Tavşan");
        burclar.put(8, "Ejderha");
        burclar.put(9, "Yılan");
        burclar.put(10, "At");
        burclar.put(11, "Koyun");

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz :");
        dogum_yili = input.nextInt();

        // 12'ye bölümünden kalaı, burçların indexi ile eşleştiriyoruz.
        burcIndex = dogum_yili % 12;
        System.out.println(burclar.get(burcIndex));

        input.close();
    }
}
