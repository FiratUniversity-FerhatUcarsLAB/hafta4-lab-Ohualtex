/*
 * Ad Soyad: Miraç Duran
 * Ogrenci No: 250541091
 * Tarih: 2.11.2025
 * Aciklama: Ogrenci Bilgi Sistemi
 */

import java.util.Scanner; // Kullanıcıdan veri almak için Scanner sınıfını içe aktarır

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Konsoldan giriş almak için Scanner nesnesi oluşturulur. //
        Scanner input = new Scanner(System.in);

        // Öğrencinin adı istenir ve bir satır olarak okunur. //
        System.out.print("Ogrencinin adini girin: ");
        String ad = input.nextLine();

        // Öğrencinin soyadı istenir ve bir satır olarak okunur. //
        System.out.print("Ogrencinin soyadini girin: ");
        String soyad = input.nextLine();

        // Öğrenci numarası istenir ve tamsayı olarak okunur. //
        System.out.print("Ogrenci numarasini girin: ");
        int ogrNo = input.nextInt();

        // Öğrencinin yaşı istenir ve tamsayı olarak okunur. //
        System.out.print("Yasini girin: ");
        int yas = input.nextInt();

        // Öğrencinin not ortalaması istenir ve ondalıklı sayı olarak okunur. //
        System.out.print("GPA (0.00 - 4.00 arasi): ");
        double gpa = input.nextDouble();

        // Çıktı bölümünü başlıkla ayırır. //
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

        // Ad ve soyadı biçimlendirilmiş şekilde yazar. //
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);

        // Öğrenci numarasını yazar. //
        System.out.printf("Ogrenci No: %d\n", ogrNo);

        // Yaşı yazar. //
        System.out.printf("Yas: %d\n", yas);

        // GPA değerini 2 ondalık basamakla yazar. //
        System.out.printf("GPA: %.2f\n", gpa);

        // GPA 2.0 ve üzeriyse "Başarılı", değilse "Başarısız" kabul edilir. //
        System.out.println("Durum: " + (gpa >= 2.0 ? "Basarili Ogrenci" : "Basarisiz Ogrenci"));

        // Kaynakları serbest bırakmak için scanner kapatılır. //
        input.close();
    }
}
