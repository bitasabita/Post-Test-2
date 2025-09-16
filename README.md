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

<img width="279" height="137" alt="image" src="https://github.com/user-attachments/assets/d9f2a255-12e2-42da-9027-a7b3829df105" />


Begitu program dijalankan, pengguna langsung disajikan menu utama yang berisi daftar pilihan. Cukup masukkan nomor menu sesuai yang diinginkan, lalu program akan menjalankan perintah tersebut. Setelah selesai, menu utama akan muncul lagi sehingga pengguna bisa melanjutkan ke pilihan lain.

Program hanya akan berhenti jika pengguna memilih opsi Keluar.

## 1. Tambah Koleksi

<img width="406" height="230" alt="image" src="https://github.com/user-attachments/assets/31bd9caa-2ad1-4b19-b872-c95355bc1522" />


Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan ukuran. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sepatu berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.

## 2. Lihat Koleksi

<img width="541" height="216" alt="image" src="https://github.com/user-attachments/assets/d8b649c2-92ae-47b7-89e2-6fd23ceb8f51" />


Menu ini akan menampilkan semua sepatu yang sudah ada dalam koleksi,informasi akan ditampilkan dalam bentuk list agar pengguna bisa melihat data dengan jelas. Kalau belum ada data, sistem akan memberi tahu bahwa koleksi masih kosong seperti dibawah ini:



## 3. Ubah Koleksi

<img width="527" height="310" alt="image" src="https://github.com/user-attachments/assets/e15e421d-d5e5-452d-957d-524d49ad2b9b" />

Jika terdapat kesalahan data atau ada perubahan, pengguna dapat memperbarui informasi sepatu yang sudah tersimpan. Pengguna memilih nomor sepatu yang ingin diubah, lalu memasukkan data baru untuk mengganti yang lama. Validasi tetap berlaku, jadi hanya nomor yang tersedia saja yang bisa diubah. Jika memasukkan nomor yang tidak tersedia tampilannya akan seperti berikut:

<img width="471" height="96" alt="image" src="https://github.com/user-attachments/assets/465373a5-55f3-4d8c-93b0-5d6a8360ccaa" />

## 4. Hapus Koleksi

<img width="658" height="563" alt="image" src="https://github.com/user-attachments/assets/7219cd8a-7727-4abd-96cb-1011147df63e" />

Menu ini memungkinkan pengguna menghapus sepatu tertentu dari daftar.Sistem akan menampilkan daftar sepatu, lalu meminta konfirmasi data mana yang ingin dihapus. Sama seperti update, hanya nomor valid yang bisa dipilih.

<img width="689" height="340" alt="image" src="https://github.com/user-attachments/assets/fad4e55f-c038-4ad6-aef7-98e5e77b38f0" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 5. Cari Koleksi

<img width="688" height="257" alt="image" src="https://github.com/user-attachments/assets/b1842f83-d03a-4824-b310-b656420faffd" />

Fitur pencarian berfungsi untuk memudahkan pengguna menemukan data sepatu tertentu ketika koleksi sudah cukup banyak. Pengguna hanya perlu memasukkan kata kunci berupa nama, merk, atau warna, kemudian sistem akan menampilkan daftar sepatu yang sesuai dengan kata kunci tersebut.

<img width="523" height="245" alt="image" src="https://github.com/user-attachments/assets/3b610936-5e2b-453e-b22d-616a7b452ed8" />

Apabila pengguna memasukkan kata kunci koleksi yang tidak tersedia, program akan menampilkan pesan "Koleksi tidak ditemukan!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.
