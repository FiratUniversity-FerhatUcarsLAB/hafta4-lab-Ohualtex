/*
 * Ad Soyad: [Mirac Duran]
 * Ogrenci No: [250541091]
 * Tarih: [2.11.2025]
 * Aciklama: Maas Hesaplama Sistemi
 */

import java.util.Scanner;
import java.time.LocalDate;

public class MaasHesap {
    public static void main(String[] args) {
        // Kullanıcı girdilerini almak için Scanner oluşturulur. //
        Scanner input = new Scanner(System.in);

        // SABITLER //
        // SGK işçi payı oranı : %15.75 //
        final double SGK_ORANI = 0.1575;
        // Gelir vergisi oranı : %15 //
        final double GELIR_VERGISI = 0.15;
        // Damga vergisi oranı : %0.759 //
        final double DAMGA_VERGISI = 0.00759;

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        // GIRDILER //
        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        // HESAPLAMALAR //

        // 1) Mesai ücreti: //
        // Varsayım: Aylık standart çalışma süresi 160 saat (haftalık 40 saat * 4 hafta). //
        // Saatlik brüt = brutMaas / 160 //
        // Mesai katsayısı = 1.5 //
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;

        // 2) Toplam brüt gelir = Normal brüt maaş + mesai ücreti. //
        double toplamGelir = brutMaas + mesaiUcreti;

        // 3) Kesintiler (brüt gelir üzerinden). //
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI;

        // 4) Toplam kesinti ve net maaş. //
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        // 5) İstatistikler:
        // Kesinti oranı: Toplam kesinti / Toplam gelir. //
        // Saatlik net: Net maaş / aylık toplam çalışma saati. //
        // Günlük net: Net maaş / ay içi iş günü varsayımı. //
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / (haftalikSaat * 4);
        double gunlukNet = netMaas / 22;

        // CIKTILAR //
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s\n", adSoyad);
        System.out.printf("Tarih: %s\n", LocalDate.now());

        System.out.println("\nGELIRLER:");
        System.out.printf("  Brut Maas              : %10.2f TL\n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %10.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %10.2f TL\n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL\n", SGK_ORANI * 100, sgk);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL\n", GELIR_VERGISI * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.2f%%)  : %10.2f TL\n", DAMGA_VERGISI * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %10.2f TL\n", toplamKesinti);

        System.out.printf("\nNET MAAS                 : %10.2f TL\n", netMaas);

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f%%\n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat\n", saatlikNet);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun\n", gunlukNet);
        System.out.println("====================================");

        // Kaynak serbest bırakılır. //
        input.close();
    }
}
