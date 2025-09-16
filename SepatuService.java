/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Sepatu;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class SepatuService {
    private ArrayList<Sepatu> koleksiSepatu = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE
    public void tambahSepatu() {
        String nama = inputString("Masukkan nama sepatu: ");
        String merk = inputString("Masukkan merk sepatu: ");
        String warna = inputString("Masukkan warna sepatu: ");
        int ukuran = inputUkuran();

        Sepatu sepatu = new Sepatu(nama, merk, warna, ukuran);
        koleksiSepatu.add(sepatu);
        System.out.println("✅ Sepatu berhasil ditambahkan!");
    }

    // READ
    public void tampilSepatu() {
        if (koleksiSepatu.isEmpty()) {
            System.out.println("⚠️ Koleksi sepatu masih kosong.");
        } else {
            System.out.println("\n--- Daftar Koleksi Sepatu ---");
            for (int i = 0; i < koleksiSepatu.size(); i++) {
                System.out.println((i + 1) + ". " + koleksiSepatu.get(i));
            }
        }
    }

    // UPDATE
    public void updateSepatu() {
        if (koleksiSepatu.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong, tidak ada yang bisa diperbarui.");
            return;
        }

        tampilSepatu();
        System.out.print("Masukkan nomor sepatu yang ingin diperbarui: ");
        int nomor = inputNomor();

        if (nomor > 0 && nomor <= koleksiSepatu.size()) {
            String nama = inputString("Masukkan nama baru: ");
            String merk = inputString("Masukkan merk baru: ");
            String warna = inputString("Masukkan warna baru: ");
            int ukuran = inputUkuran();

            koleksiSepatu.set(nomor - 1, new Sepatu(nama, merk, warna, ukuran));
            System.out.println("✅ Sepatu berhasil diperbarui!");
        } else {
            System.out.println("❌ Nomor sepatu tidak valid.");
        }
    }

    // DELETE
    public void hapusSepatu() {
        if (koleksiSepatu.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong, tidak ada yang bisa dihapus.");
            return;
        }

        tampilSepatu();
        System.out.print("Masukkan nomor sepatu yang ingin dihapus: ");
        int nomor = inputNomor();

        if (nomor > 0 && nomor <= koleksiSepatu.size()) {
            koleksiSepatu.remove(nomor - 1);
            System.out.println("✅ Sepatu berhasil dihapus.");
        } else {
            System.out.println("❌ Nomor sepatu tidak valid.");
        }
    }

    // SEARCH
    public void cariSepatu() {
        if (koleksiSepatu.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong.");
            return;
        }

        String keyword = inputString("Masukkan nama/merk/warna sepatu yang dicari: ").toLowerCase();
        boolean ditemukan = false;

        for (Sepatu sepatu : koleksiSepatu) {
            if (sepatu.getNama().toLowerCase().contains(keyword) ||
                sepatu.getMerk().toLowerCase().contains(keyword) ||
                sepatu.getWarna().toLowerCase().contains(keyword)) {
                System.out.println("🔍 " + sepatu);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("❌ Tidak ada sepatu yang cocok dengan kata kunci.");
        }
    }

    // --- Helper Function untuk Validasi ---
    private String inputString(String pesan) {
        String input;
        while (true) {
            System.out.print(pesan);
            input = scanner.nextLine().trim();
            if (!input.isEmpty() && !input.matches("\\d+")) {
                return input;
            } else {
                System.out.println("⚠️ Input tidak boleh kosong atau berupa angka saja.");
            }
        }
    }

    private int inputUkuran() {
        while (true) {
            try {
                System.out.print("Masukkan ukuran sepatu: ");
                int ukuran = Integer.parseInt(scanner.nextLine());
                if (ukuran > 0) {
                    return ukuran;
                } else {
                    System.out.println("⚠️ Ukuran harus lebih dari 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Input harus berupa angka.");
            }
        }
    }

    private int inputNomor() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("⚠️ Input harus berupa angka. Ulangi: ");
            }
        }
    }
}
    

