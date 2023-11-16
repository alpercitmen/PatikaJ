import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        int temprature;
        String result;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Sıcaklık değerini giriniz:");
            temprature = input.nextInt();

            // Yöntem 1
            /*
            if (temprature < 5) {
                result = "Kayak yapabilirsiniz.";
            }else if(temprature >= 5 && temprature < 15){
                result = "Sinemaya gidebilirsiniz.";
            }else if(temprature >= 15 && temprature < 25){
                result = "Pikniğe gidebilirsiniz.";
            } else {
                result = "Yüzmeye gidebilirsiniz.";
            }
            
            System.out.println(result);
             */

            // Yöntem 2
            /* result = (temprature < 5 ? "Kayak yapabilirsiniz."
                    : (temprature >= 5 && temprature < 15 ? "Sinemaya gidebilirsiniz."
                            : (temprature >= 15 && temprature < 25 ? "Pikniğe gidebilirsiniz."
                                    : "Yüzmeye gidebilirsiniz.")));

            System.out.println(result); */


            // Yöntem 3
            if (temprature < 5)
                result = "Kayak yapabilirsiniz.";
            else if (temprature >= 5 && temprature < 15)
                result = "Sinemaya gidebilirsiniz.";
            else if (temprature >= 15 && temprature < 25)
                result = "Pikniğe gidebilirsiniz.";
            else
                result = "Yüzmeye gidebilirsiniz.";

            System.out.println(result);

        }
    }
}
