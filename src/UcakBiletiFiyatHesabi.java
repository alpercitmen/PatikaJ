import java.util.Scanner;

public class UcakBiletiFiyatHesabi {
    public static void main(String[] args) {
        int km, yas, yolculuk_tipi;
        float mesafe_basi_ucret = 0.10f, yas_indirimi = 0.0f, yolculuk_tipi_indirimi = 0.0f, toplam_tutar = 0;

        System.out.println("Mesafeyi km türünden giriniz :");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuk_tipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculuk_tipi == 1 || yolculuk_tipi == 2)) {
            toplam_tutar = km * mesafe_basi_ucret;
            // System.out.println("Toplam Tutar = " + toplam_tutar);
            if (yas < 12) {
                yas_indirimi = toplam_tutar * 0.5f;
                // System.out.println("Yaş İndirimi = " + yas_indirimi);
            } else if (yas >= 12 && yas <= 24) {
                yas_indirimi = toplam_tutar * 0.1f;
                // System.out.println("Yaş İndirimi = " + yas_indirimi);
            } else if (yas > 65) {
                yas_indirimi = toplam_tutar * 0.3f;
                // System.out.println("Yaş İndirimi = " + yas_indirimi);
            }
            toplam_tutar -= yas_indirimi;
            // System.out.println("Toplam Tutar = " + toplam_tutar);

            if (yolculuk_tipi == 2) {
                yolculuk_tipi_indirimi = toplam_tutar * 0.2f;
                // System.out.println("Yolculuk Tipi İndirimi = " + yolculuk_tipi_indirimi);
                toplam_tutar -= yolculuk_tipi_indirimi;
                toplam_tutar *= 2; // Gidiş dönüş olduğu için 2 ile çarpılıyor.
            }
            
            System.out.println("Toplam Tutar = " + toplam_tutar);
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        input.close();
    }
}
