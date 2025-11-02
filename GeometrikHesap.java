/*
 * Ad Soyad : Miraç Duran
 * Ogrenci No: 250541091
 * Tarih : 2.11.2025
 * Aciklama : Geometrik Hesaplayici
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Pi sabiti //
        final double PI = 3.14159;

        // Kullanici girisi icin Scanner nesnesi //
        Scanner input = new Scanner(System.in);

        // Baslik ve veri girisi //
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");

        // Kullanici tarafindan girilen yaricap (r) //
        double r = input.nextDouble();

        // Hesaplamalar //
        // Daire alani: A = π * r^2 //
        double daireAlani = PI * Math.pow(r, 2);

        // Daire cevresi: C = 2 * π * r //
        double daireCevresi = 2 * PI * r;

        // Daire capi: d = 2 * r //
        double daireCapi = 2 * r;

        // Kurenin hacmi: V = (4/3) * π * r^3 //
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);

        // Kurenin yuzey alani: S = 4 * π * r^2 //
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

        // Sonuclari yazdirma //
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm^2\n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm\n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm\n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm^3\n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm^2\n", kureYuzeyAlani);

        // Kaynaklari serbest birak. //
        input.close();
    }
}
