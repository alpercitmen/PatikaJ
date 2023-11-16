import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String userName, password, newPass;
            int passChange;

            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("test") && password.equals("123456")) {
                System.out.println("Başarıyla giriş yaptınız...");
            } else if (userName.equals("test") && password != "123456") {
                System.out.println("Şifrenizi yanlış girdiniz. Değiştirmek ister misiniz?\n1-Evet\n2-Hayır");
                passChange = input.nextInt();
                switch (passChange) {
                    case 1:
                        System.out.println("Yeni Şifrenizi Giriniz: ");
                        newPass = input.next();
                        if (newPass.equals("123456") || newPass.equals(password)) {
                            System.out.println("Şifre oluşturulamadı.");
                        } else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;
                    case 2:
                        System.out.println("Lütfen tekrar giriş yapmayı deneyin.");
                        break;
                }
            } else {
                System.out.println("Kullanıcı adı ya da şifreniz hatalı!");
            }
        }
    }

}
