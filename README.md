# Post-Test-2

# 👟 Sistem Manajemen Koleksi Sepatu Digital 

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Tsabitah Kawiswara        | 2409116099    | Sistem Informasi C |

## 📄Deskripsi Program
Sistem manajemen koleksi sepatu digital adalah sebuah program yang dirancang untuk membantu mengatur dan menyimpan data sepatu secara lebih terstruktur. Dengan menerapkan prinsip Pemrograman Berorientasi Objek (OOP), sistem ini mampu menyajikan pengelolaan data yang efisien, rapi, dan mudah dipahami. Setiap detail sepatu, mulai dari jenis, warna, hingga ukuran, dapat dicatat dan diakses dengan lebih praktis tanpa harus bergantung pada ingatan atau catatan manual. Dengan demikian, koleksi sepatu menjadi lebih tertata, terorganisir, serta meminimalisir risiko kesalahan dalam pencatatan data.

Program ini dibuat dengan konsep:

* **Constructor** → digunakan untuk membuat dan menginisialisasi objek sepatu.
* **Access modifier** (private & public)**→ menjaga agar data tetap aman dan hanya bisa diakses lewat method tertentu.
* **Validasi input**→ memastikan data yang dimasukkan benar (misalnya ukuran sepatu harus berupa angka).
* **Fitur Search**→ memudahkan pengguna menemukan data koleksi dengan cepat.

Fitur utama yang tersedia:

1. **Tambah Koleksi**: pengguna bisa menambahkan sepatu baru dengan detail                               lengkap (nama, merk, warna, ukuran).
2. **Lihat Koleksi**: menampilkan seluruh sepatu yang sudah tersimpan di dalam                          daftar.
3. **Ubah Koleksi**: memungkinkan pengguna memperbarui data sepatu tertentu.
4. **Hapus Koleksi**: menghapus data sepatu dari daftar jika sudah tidak                                diperlukan.
5. **Cari Koleksi**: mencari sepatu berdasarkan kata kunci, misalnya nama, merk,                       atau warna
6. **Keluar Program**: menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

# Struktur Packages 

<img width="560" height="182" alt="image" src="https://github.com/user-attachments/assets/2c2cbe87-2d13-4602-8730-0b66e9e21077" />

Program ini disusun menggunakan konsep Model-View-Controller (MVC):

* **model**: berisi class Sepatu yang mendefinisikan atribut (nama, merk, warna, ukuran) beserta constructor dan getter/setter.

  AlatMakeup.java: mendefinisikan properties (nama, jenis, merk, jumlah) dengan constructor dan getter/setter.
  
* **service**: Berisi logika bisnis CRUD dan fitur tambahan seperti validasi input dan pencarian.

  KoleksiService.java: mengelola list koleksi makeup, menambahkan, menampilkan, memperbarui, menghapus, dan mencari data.
  
* **main**: Menyimpan class Main yang menampilkan menu dan menghubungkan pengguna dengan service.

  Main.java: Menampilkan menu, menerima input dari pengguna, memanggil method pada KoleksiService

Dengan pemisahan ini, struktur kode menjadi lebih rapi, mudah dipelihara, dan sesuai konsep MVC.

# Cara Menggunakan Program

<details>
<summary><h3>Menu Utama Koleksi Sepatu</h3></summary>

<img width="318" height="178" alt="image" src="https://github.com/user-attachments/assets/0f447f12-3ad8-47d9-907e-63f4739b898e" />

Begitu program dijalankan, pengguna langsung disajikan menu utama yang berisi daftar pilihan. Cukup masukkan nomor menu sesuai yang diinginkan, lalu program akan menjalankan perintah tersebut. Setelah selesai, menu utama akan muncul lagi sehingga pengguna bisa melanjutkan ke pilihan lain.

Program hanya akan berhenti jika pengguna memilih opsi Keluar.

## 1. Tambah Koleksi

<img width="461" height="307" alt="image" src="https://github.com/user-attachments/assets/36267c6b-f627-4d59-aadd-7fce7ad4b57c" />

Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan ukuran. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sepatu berhasil ditambahkan!"

Kalau input tidak sesuai, misalnya ukuran bukan angka, program akan menolak dan menampilkan pesan error sampai pengguna mengisi dengan benar.

<img width="387" height="257" alt="image" src="https://github.com/user-attachments/assets/a0fb64c5-fb49-4dcc-920a-224b6e19b3d6" />

Saat pengguna diminta memasukkan Nama Alat Makeup, pengguna menekan enter tanpa mengetikkan apapun sehingga program akan menampilkan pesan "Nama tidak boleh kosong!" dan berlaku untuk memasukkan jenis makeup, merk, dan jumlah.

## 2. Lihat Koleksi

<img width="648" height="291" alt="image" src="https://github.com/user-attachments/assets/05f1adac-5451-46a9-9901-6cd1479c5be6" />

Menu ini akan menampilkan semua sepatu yang sudah ada dalam koleksi. Kalau belum ada data, sistem akan memberi tahu bahwa koleksi masih kosong.

## 3. Ubah Koleksi

<img width="721" height="502" alt="image" src="https://github.com/user-attachments/assets/09e0ea09-786d-48f6-ad8e-98439884953b" />

Pengguna memilih nomor sepatu yang ingin diubah, lalu memasukkan data baru untuk mengganti yang lama. Validasi tetap berlaku, jadi hanya nomor yang tersedia saja yang bisa diubah.

<img width="649" height="325" alt="image" src="https://github.com/user-attachments/assets/f171e1a5-256e-49fc-89fc-b6135c31b6fd" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 4. Hapus Koleksi

<img width="658" height="563" alt="image" src="https://github.com/user-attachments/assets/7219cd8a-7727-4abd-96cb-1011147df63e" />

Menu ini memungkinkan pengguna menghapus sepatu tertentu dari daftar. Sama seperti update, hanya nomor valid yang bisa dipilih.

<img width="689" height="340" alt="image" src="https://github.com/user-attachments/assets/fad4e55f-c038-4ad6-aef7-98e5e77b38f0" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 5. Cari Koleksi

<img width="688" height="257" alt="image" src="https://github.com/user-attachments/assets/b1842f83-d03a-4824-b310-b656420faffd" />

Fitur pencarian sangat membantu jika daftar sepatu sudah banyak. Cukup masukkan kata kunci (nama, merk, atau warna), maka sistem akan menampilkan semua sepatu yang cocok.

<img width="523" height="245" alt="image" src="https://github.com/user-attachments/assets/3b610936-5e2b-453e-b22d-616a7b452ed8" />

Apabila pengguna memasukkan kata kunci koleksi yang tidak tersedia, program akan menampilkan pesan "Koleksi tidak ditemukan!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.
