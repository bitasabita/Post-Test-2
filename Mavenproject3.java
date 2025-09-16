/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;
import service.SepatuService;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SepatuService service = new SepatuService();
        int pilihan;

        do {
            System.out.println("\n=== MENU CRUD KOLEKSI SEPATU ===");
            System.out.println("1. Tambah Sepatu");
            System.out.println("2. Tampilkan Semua Sepatu");
            System.out.println("3. Perbarui Sepatu");
            System.out.println("4. Hapus Sepatu");
            System.out.println("5. Cari Sepatu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.print("⚠️ Input harus angka. Ulangi: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1 -> service.tambahSepatu();
                case 2 -> service.tampilSepatu();
                case 3 -> service.updateSepatu();
                case 4 -> service.hapusSepatu();
                case 5 -> service.cariSepatu();
                case 0 -> System.out.println("👋 Terima kasih, program selesai.");
                default -> System.out.println("⚠️ Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
    

