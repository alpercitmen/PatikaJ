import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            float kdv, tutar, kdvliFiyat, kdvsizFiyat, kdvTutari;

            System.out.println("Tutarı girin: ");
            tutar = input.nextFloat();

            if (tutar > 0 && tutar <= 1000) {
                kdv = 0.18f;
            } else if (tutar > 1000){
                kdv = 0.8f;
            }else{
                System.out.println("Tutar negatif olamaz!");
                kdv = 0;
            }

            kdvliFiyat = tutar + (tutar * kdv);
            
            kdvsizFiyat = tutar;
            kdvTutari = kdvliFiyat - kdvsizFiyat;
    
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
            System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
            System.out.println("KDV Tutarı: " + kdvTutari);
        }


    }
}
