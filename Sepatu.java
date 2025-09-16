/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Sepatu {
    private String nama;
    private String merk;
    private String warna;
    private int ukuran;

    public Sepatu(String nama, String merk, String warna, int ukuran) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public int getUkuran() { return ukuran; }
    public void setUkuran(int ukuran) { this.ukuran = ukuran; }

    @Override
    public String toString() {
        return "Nama: " + nama + " | Merk: " + merk + " | Warna: " + warna + " | Ukuran: " + ukuran;
    }
}
    

