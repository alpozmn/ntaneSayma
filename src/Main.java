import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini al
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // İlk sayıyı en büyük ve en küçük olarak al
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        // Diğer sayıları kontrol et
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            // En büyük sayıyı güncelle
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            // En küçük sayıyı güncelle
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
