import java.util.Scanner;

public class App {
    static boolean cikis=false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("1. Girilen Metni Terten Yaz \n"
                + "2. Girilen Sayı Kadar * ile L Oluştur \n"
                + "3. Girilen Metnin İstediği Aralığını Alma \n"
                + "4. Girilen Sayıya Kadar Tek Sayıları Göster \n"
                + "5. Girilen Sayıya Kadar Çift Sayıları Göster \n"
                + "6. Çıkış");
        System.out.println("**************");
        while (!cikis) {
            System.out.print("\n Hangi İşlemi Yapmak İstiyorsunuz: ");
            int islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 1:
                    girilenMetniTerstenYaz(scanner);
                    break;
                case 2:
                    alinanDegereGoreYildizYazdir(scanner);
                    break;
                case 3:
                    alinanDegerlereGoreMetniBolme(scanner);
                    break;
                case 4:
                    kuadanAlinanSayiyaKadarOlanTekSayilar(scanner);
                    break;
                case 5:
                    kuadanAlinanSayiyaKadarOlanCiftSayilar(scanner);
                    break;
                case 6:
                    cikis = true;
                    System.out.println("---- Güle Güle ----");
                    break;
                default:
                    break;
            }
        }
    }

    public static void girilenMetniTerstenYaz(Scanner scanner) {
        System.out.print("Metin Giriniz: ");
        String alinanMetin = scanner.nextLine();
        System.out.println("******Metninizin Ters Hali******");
        for (int i = alinanMetin.length() - 1; i >= 0; i--) {
            System.out.print(alinanMetin.charAt(i));
        }
    }

    public static void alinanDegereGoreYildizYazdir(Scanner scanner) {
        System.out.print("Sayı Giriniz: ");
        int alinanSayi = scanner.nextInt();
        for (int i = 1; i <= alinanSayi - 1; i++) {
            System.out.print(" * ");
        }
        for (int j = 1; j <= alinanSayi; j++) {
            System.out.println("*");
        }
    }

    public static void alinanDegerlereGoreMetniBolme(Scanner scanner) {
        System.out.print("Metin Giriniz: ");
        String alinanMetin = scanner.next();

        System.out.print("Başlangıç: ");
        int alinanBaslangic = scanner.nextInt();

        System.out.print("Bitiş: ");
        int alinanBitis = scanner.nextInt();
        System.out.println(alinanMetin.subSequence(alinanBaslangic , alinanBitis));
    }

    public static void kuadanAlinanSayiyaKadarOlanCiftSayilar(Scanner scanner) {
        System.out.print("\nBir Sayı Giriniz: ");
        int girilenSayi = scanner.nextInt();
        for (int i = 0; i < girilenSayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void kuadanAlinanSayiyaKadarOlanTekSayilar(Scanner scanner) {
        System.out.print("\nBir Sayı Giriniz: ");
        int girilenSayi = scanner.nextInt();
        for (int i = 0; i < girilenSayi; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
