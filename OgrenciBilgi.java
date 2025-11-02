/*
 * Ad Soyad: [Mirac Duran]
 * Ogrenci No: [250541091]
 * Tarih: [2.11.2025]
 * Aciklama: Ogrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcı girdisi için scanner açıldı //
        System.out.print("Ogrencinin adini girin: ");
        String ad = input.nextLine();
        // Ad girdisi //
        System.out.print("Ogrencinin soyadini girin: ");
        String soyad = input.nextLine();
        // Soyad girdisi //
        System.out.print("Ogrenci numarasini girin: ");
        int ogrNo = input.nextInt();
        // Öğrenci No girdisi //
        System.out.print("Yasini girin: ");
        int yas = input.nextInt();
        // Yaş girdisi //
        System.out.print("GPA (0.00 - 4.00 arasi): ");
        double gpa = input.nextDouble();
        // Not ortalaması girdisi // 

        // Cikti //
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrNo);
        System.out.printf("Yas: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Durum: " + (gpa >= 2.0 ? "Basarili Ogrenci" : "Basarisiz Ogrenci"));

        input.close();
    }
}

