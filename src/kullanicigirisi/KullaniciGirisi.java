package kullanicigirisi;
import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner  = new Scanner(System.in);
        
        String kullanici_adi = "Caner_Giden";
        String sifre = "Canergiden03";
        
        System.out.print("Lütfen Kullanıcı Adını Girin : ");
        String kullanici_adi_giris = scanner.nextLine();
        System.out.print("Lütfen Şifrenizi Girin : ");
        String sifre_giris = scanner.nextLine();

        if(sifre_giris.equals(sifre)){
            System.out.println("Şifre Doğru. Giriş Başarılı...");
        }
        
        else{
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String sifre_sifirlama = scanner.nextLine();

            if (sifre_sifirlama.equalsIgnoreCase("Evet")) {
                System.out.print("Lütfen yeni şifrenizi girin: ");
                String yeni_sifre = scanner.nextLine();

                if (yeni_sifre.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı. Yeni şifreniz eski şifre ile aynı olamaz.");
                } else {
                    sifre = yeni_sifre;
                    System.out.println("Şifre oluşturuldu.");
                }
        }    
    }   
  }
}
